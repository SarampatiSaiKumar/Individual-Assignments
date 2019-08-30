import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {AdminloginComponent} from './adminlogin/adminlogin.component';
import {CustomerhomeComponent} from './customerhome/customerhome.component';
  import { from } from 'rxjs';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {
    path:'',
    redirectTo:'login',
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'admin',
    component:HomeComponent,
    data : {userType : 'bank'},
    children:[
      {path:'',redirectTo:"home",pathMatch:"full"},
      // {path:"add",component:AddCustomerComponent},
      // {path:"edit",component:EditCustomerComponent},
      // {path:"edit/editCustomer/:id",component:EditCustomerDetailsComponent},
      // {path:"edit/editCustomer/:id/addAccount",component:AddAccountComponent},
      // {path:"edit/editCustomer/:cid/history/:id",component:TransactionHistoryComponent},
      // {path:"transactions",component:AllTransactionsComponent},
      // {path:"transactions/:id",component:TransactionInfoComponent},
    ]
  },
  {
    path:'customer',
    // component:CustomerComponent,
    // data : {userType : 'user'},
    // children:[
    //   {path:'',redirectTo:"viewAccounts",pathMatch:"full"},
    //   {path:"profile",component:ProfileComponent},
    //   {path:"viewAccounts",component:AccountInfoComponent},
    //   {path:"transaction",component:TransactionComponent},
    //   {path:"viewAccounts/history/:id",component:TransactionHistoryComponent},
   // ]
  },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'custhome', component: CustomerhomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
