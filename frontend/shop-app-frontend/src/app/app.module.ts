import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginFormComponent } from './form/login-form/login-form.component';
import {Router, RouterModule, Routes} from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import {FormsModule} from '@angular/forms';
import {ProductService} from './service/ProductService/product.service';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './component/navbar/navbar.component';
import { ProductComponent } from './component/product/product.component';
import { AppRoutingModule } from './app-routing.module';
import { ComputerCaseComponent } from './component/computercase/computer-case.component';
import { CpuComponent } from './component/cpu/cpu.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    HomeComponent,
    NavbarComponent,
    ProductComponent,
    ComputerCaseComponent,
    CpuComponent,
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
