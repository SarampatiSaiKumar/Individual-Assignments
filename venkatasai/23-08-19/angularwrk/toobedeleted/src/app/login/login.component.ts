import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  public userName: string="admin";
  public pwd: string="pass";
  public loginStatus:string;

  public Login(pStatus:any,pbst:any,imgstatus:any){
    if(this.userName=="admin" && this.pwd=="pass"){
      this.loginStatus="successfull"
      pStatus.style="color:green"
      //pbst.disabled=true
     pbst.style= "button:disabled"// cursor: not-allowed; background-color: rgb(229, 229, 229)"
      imgstatus.src="/assets/wreck.jpg"

    }
    else{
      this.loginStatus="Login failed Wrong credentials!"    
      pStatus.style="color:red"
      pbst.disabled=true
     pbst.style= " cursor: not-allowed; background-color: rgb(229, 229, 229)"
    }
  }
}
