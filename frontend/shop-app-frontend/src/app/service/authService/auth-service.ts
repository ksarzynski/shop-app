import {EventEmitter, Injectable, Output} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {RegisterPayload} from '../../model/registerPayload/register-payload';
import {LoginPayload} from '../../model/loginPayload/login-payload';
import {LoginResponse} from '../../model/loginResponse/login-response';
import {map, tap} from 'rxjs/operators';
import {LocalStorageService} from 'ngx-webstorage';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  @Output() loggedIn: EventEmitter<boolean> = new EventEmitter();
  @Output() username: EventEmitter<string> = new EventEmitter();

  refreshTokenPayload = {
    refreshToken: this.getRefreshToken(),
    username: this.getUserName()
  };

  constructor(private httpClient: HttpClient, private localStorage: LocalStorageService) {
  }

  signup(registerPayload: RegisterPayload): Observable<any> {
    return this.httpClient.post('http://localhost:8080/auth/signup', registerPayload, { responseType: 'text' });
  }

  login(loginPayload: LoginPayload): Observable<boolean> {
    return this.httpClient.post<LoginResponse>('http://localhost:8080/auth/login',
      loginPayload).pipe(map(data => {
      this.localStorage.store('authenticationToken', data.authenticationToken);
      this.localStorage.store('username', data.username);
      this.localStorage.store('refreshToken', data.refreshToken);
      this.localStorage.store('expiresAt', data.expiresAt);
      this.loggedIn.emit(true);
      this.username.emit(data.username);
      return true;
    }));
  }

  getJwtToken(): any {
    return this.localStorage.retrieve('authenticationToken');
  }

  refreshToken(): Observable<LoginResponse>{
    return this.httpClient.post<LoginResponse>('http://localhost:8080/auth/refresh/token',
      this.refreshTokenPayload)
      .pipe(tap(response => {
        this.localStorage.clear('authenticationToken');
        this.localStorage.clear('expiresAt');

        this.localStorage.store('authenticationToken',
          response.authenticationToken);
        this.localStorage.store('expiresAt', response.expiresAt);
      }));
  }

  logout(): void{
    this.httpClient.post('http://localhost:8080/auth/logout', this.refreshTokenPayload,
      { responseType: 'text' })
      .subscribe(data => {
        console.log(data);
      }, error => {
        throwError(error);
      });
    this.localStorage.clear('authenticationToken');
    this.localStorage.clear('username');
    this.localStorage.clear('refreshToken');
    this.localStorage.clear('expiresAt');
  }

  getUserName(): any {
    return this.localStorage.retrieve('username');
  }
  getRefreshToken(): any {
    return this.localStorage.retrieve('refreshToken');
  }

  isLoggedIn(): boolean {
    return this.getJwtToken() != null;
  }
}
