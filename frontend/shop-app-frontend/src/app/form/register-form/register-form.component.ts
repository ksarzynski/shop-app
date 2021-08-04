import { Component, OnInit } from '@angular/core';
import {AuthService} from '../../service/authService/auth-service';
import {RegisterPayload} from '../../model/registerPayload/register-payload';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  signupForm: FormGroup;
  registerPayload: RegisterPayload;

  constructor(private authService: AuthService,
              private router: Router) {
    this.registerPayload = {
      username: '',
      email: '',
      password: ''
    };
  }

  ngOnInit(): void{
    this.signupForm = new FormGroup({
      username: new FormControl('', Validators.required),
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', Validators.required),
    });
  }

  signup(): void {
    this.registerPayload.email = this.signupForm.get('email').value;
    this.registerPayload.username = this.signupForm.get('username').value;
    this.registerPayload.password = this.signupForm.get('password').value;

    this.authService.signup(this.registerPayload)
      .subscribe(data => {
        console.log('registered');
      });
  }
}
