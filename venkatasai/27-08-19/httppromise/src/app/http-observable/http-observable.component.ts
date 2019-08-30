import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-http-observable',
  templateUrl: './http-observable.component.html',
  styleUrls: ['./http-observable.component.css']
})
export class HttpObservableComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.getcall()
  }

  ngOnDetroy(){
    this.subscribedData.unsubscribe();
  }
  public subscribedData:Subscription;

  getcall(){
    this.subscribedData=this.http.get("http://localhost:8100/web/getAll").subscribe( (data) => {
      console.log(data);
    })

    //alternative way
    //this.http.get("http://jsonplaceholder.typicode.com/posts").subscribe((data) >= ))

  }
  destroyCall(){
    this.subscribedData.unsubscribe();
  }


}
