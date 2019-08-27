import { Component, OnInit, Input, Output } from '@angular/core';
import { EventEmitter } from 'protractor';

@Component({
  selector: 'app-speak',
  templateUrl: './speak.component.html',
  styleUrls: ['./speak.component.css']
})
export class SpeakComponent implements OnInit {


  @Input() wordsToBeSpoken: string;
  @Output() speak= new EventEmitter()
  

  constructor() { }

  ngOnInit() {
  }

}
