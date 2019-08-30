import { Component, OnInit } from '@angular/core';

import { CustomerService } from '../Services/customer.service';;
import { Router } from '@angular/router';
import { customer } from '../datamodels/customer';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {HttpClient, HttpParams} from '@angular/common/http';

import { from } from 'rxjs';

@Component({
  selector: 'app-editcustomer',
  templateUrl: './editcustomer.component.html',
  styleUrls: ['./editcustomer.component.css']
})
export class EditcustomerComponent implements OnInit {

  id: string;
  firstname:string;
  status:string;
  message:string;
  details:any;
  constructor(private formBuilder: FormBuilder,private objHttp:HttpClient,private router: Router,private authService: AuthService) { 
    
  }

  ngOnInit() {
    this.firstname=localStorage.getItem('customerName'); 
    
    this.id = localStorage.getItem('customerId'); 
    this.Customerwithaccounts();
  }
  logout() {  
    console.log('logout');  
    this.authService.logout();  
    this.router.navigate(['/login']);  
  }  
  Customerwithaccounts(){
    
    this.objHttp.get("http://172.20.1.8:8100/bankapi/account/customer/"+this.id
        )
        .toPromise() 
        .then(
            data => {
                console.log("Get Request is successful ", data);
                if(data)
                {
                 this.details=data;
                     console.log("success");
                  
                }
                
        );
              } 
  
  }

  
}
