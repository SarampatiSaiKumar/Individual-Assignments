import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { customer } from '../datamodels/customer';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  
  // private CUSTOMER_URL ="http://localhost:8080/api/v1/customer";
  
    private CUSTOMER_URL ="http://192.168.0.21:8100/bankapi/customer/";

  constructor(private httpClient:HttpClient) { }

  findbyEmailAndPassword(email,password):Observable<customer>{
    let body = new HttpParams();
     body = body.set('userName', email); body = body.set('pass', password);
     
    return this.httpClient.post<customer>(this.CUSTOMER_URL+'login',body);   
  }

  addCustomer(data):string{
    if(this.httpClient.post<any>(this.CUSTOMER_URL+'add',data).subscribe(res=>"success")!=null)
      return "Customer Details Inserted";
    else return "Unable to Insert Customer details";
  }

  findAll(){
    return this.httpClient.get<customer>(this.CUSTOMER_URL+'getall');
  }

  findById(id):Observable<customer>{
    return this.httpClient.get<customer>(this.CUSTOMER_URL+"/"+id);
  }

  updateCustomer(data){
    return this.httpClient.put<customer>(this.CUSTOMER_URL+'update',data);
  }
  deleteCustomer(id){
    return this.httpClient.delete(this.CUSTOMER_URL+'/delete/'+id);
  }
}
