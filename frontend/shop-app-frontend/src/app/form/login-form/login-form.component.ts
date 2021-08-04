import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {AuthService} from '../../service/authService/auth-service';
import {Router} from '@angular/router';
import {LoginPayload} from '../../model/loginPayload/login-payload';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  loginForm: FormGroup;
  loginPayload: LoginPayload;

  constructor(private authService: AuthService,
              private router: Router,
              private toastr: ToastrService) {
    this.loginPayload = {
      username: '',
      password: ''
    };
  }

  ngOnInit(): void{
    this.loginForm = new FormGroup({
      username: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required),
    });
  }

  login(): void {

    this.loginPayload.username = this.loginForm.get('username').value;
    this.loginPayload.password = this.loginForm.get('password').value;

    this.authService.login(this.loginPayload)
      .subscribe(data => {
        this.toastr.success('zalogowałeś/aś się pomyślnie');
      });
  }

}
