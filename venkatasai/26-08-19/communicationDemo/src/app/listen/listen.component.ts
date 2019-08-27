import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listen',
  templateUrl: './listen.component.html',
  styleUrls: ['./listen.component.css']
})
export class ListenComponent implements OnInit {

  inputValue:string;
prop:string = "this is my own ng model which is passing through the input and output without using emitter";
  constructor() { }

  ngOnInit() {
  }

}
