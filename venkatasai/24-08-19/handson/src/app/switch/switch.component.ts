import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {
  public operations:string[]=["+","-","*","/"];
public currentOperator:string="+";

public num1:number=100;
public num2:number=200;
constructor() { }

  ngOnInit() {
  }

}
