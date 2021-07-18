import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './component/home/home.component';
import {LoginFormComponent} from './form/login-form/login-form.component';
import {ProductComponent} from './component/product/product.component';
import {ComputerCaseComponent} from './component/computercase/computer-case.component';
import {CpuComponent} from './component/cpu/cpu.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home'},
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginFormComponent },
  { path: 'products', component: ProductComponent },
  { path: 'computer-cases', component: ComputerCaseComponent },
  { path: 'cpus', component: CpuComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
