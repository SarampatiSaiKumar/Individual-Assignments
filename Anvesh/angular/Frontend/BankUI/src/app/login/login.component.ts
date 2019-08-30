import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userType='Customer';
  otherUserType='Banker';
  response;
  error="";
  constructor(private loginService:LoginService,private router: Router) { }

  ngOnInit() {
  }

  login(formData){
    if(this.userType==='Banker'){
        this.loginService.findbyUsernameAndPasswordForAdmin(formData.value.email,formData.value.password)
        .subscribe(response => {
          console.log(response);
          localStorage.setItem('userType','admin');
          localStorage.setItem('userName',response.adminName);
          if(response!=null){
            this.router.navigateByUrl('admin');
            this.error="";
          }
          else this.error="Incorrect Email/Password";
        })
      }
    else if(this.userType==='Customer'){
      this.loginService.findbyEmailAndPasswordForCustomer(formData.value.email,formData.value.password)
        .subscribe(response => {
          if(response!=null){
            localStorage.setItem('userType','customer');
            localStorage.setItem('userId',response.cust_id.toString());
            localStorage.setItem('userName',response.first_name.concat(' ',response.last_name));
            console.log(localStorage.getItem('userName'))
            console.log(localStorage.getItem('userId'));
            this.router.navigateByUrl('customer');
            this.error="";
          }
          else this.error="Incorrect Email/Password";
        })
    }

    formData.reset();
  }
  changeType(){
    if(this.userType=='Customer'){
      this.userType='Banker';
      this.otherUserType='Customer';
    }else{
      this.userType='Customer';
      this.otherUserType='Banker';
    }
  }
}
