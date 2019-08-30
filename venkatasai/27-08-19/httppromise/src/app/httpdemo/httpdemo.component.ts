import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-httpdemo',
  templateUrl: './httpdemo.component.html',
  styleUrls: ['./httpdemo.component.css']
})
export class HttpdemoComponent {

  pData:any []=[]
  constructor(public http:HttpClient) { }



getCall(){
  
this.http.get("http://jsonplaceholder.typicode.com/posts")
.toPromise()
.then(
  (data)=>{
    this.pData.push(data);
    console.log(data);},
  (error)=>{console.log(error);}
)
.catch((err)=>{
console.log("in catch block");
console.log(err);
}
)
.finally(()=>{console.log("in finally block");});
}
}
