import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginFormComponent } from './form/login-form/login-form.component';
import { HomeComponent } from './component/home/home.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {ProductService} from './service/productService/product.service';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import { NavbarComponent } from './component/navbar/navbar.component';
import { ProductComponent } from './component/product/product.component';
import { AppRoutingModule } from './app-routing.module';
import { ComputerCaseComponent } from './component/computercase/computer-case.component';
import { CpuComponent } from './component/cpu/cpu.component';
import { RegisterFormComponent } from './form/register-form/register-form.component';
import {NgxWebstorageModule} from 'ngx-webstorage';
import {ToastrModule} from 'ngx-toastr';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {TokenInterceptor} from './token-interceptor';

@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    HomeComponent,
    NavbarComponent,
    ProductComponent,
    ComputerCaseComponent,
    CpuComponent,
    RegisterFormComponent,
  ],
    imports: [
        HttpClientModule,
        BrowserModule,
        FormsModule,
        AppRoutingModule,
        ReactiveFormsModule,
        NgxWebstorageModule.forRoot(),
        BrowserAnimationsModule,
        ToastrModule.forRoot()
    ],
  providers: [ProductService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: TokenInterceptor,
      multi: true
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }
