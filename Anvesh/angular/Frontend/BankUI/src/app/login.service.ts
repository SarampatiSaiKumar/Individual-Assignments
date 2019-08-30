import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import { Observable } from 'rxjs';
import { customer } from './datamodels/customer';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  
  
  private BANKER_LOGIN_URL ="http://192.168.0.21:8100/bankapi/banker/login";

  private CUSTOMER_LOGIN_URL ="http://192.168.0.21:8100/bankapi/customer/login";

  constructor(private httpClient:HttpClient) { }

  findbyUsernameAndPasswordForAdmin(username,password):Observable<any>{
    let body = new HttpParams();
    body = body.set('userName', username); body = body.set('pass', password);
    
   return this.httpClient.post<String>(this.BANKER_LOGIN_URL,body); 
  }

  findbyEmailAndPasswordForCustomer(email,password):Observable<customer>{
    let body = new HttpParams();
     body = body.set('userName', email); body = body.set('pass', password);
     
    return this.httpClient.post<customer>(this.CUSTOMER_LOGIN_URL,body);   
  }
}
