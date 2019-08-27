import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-speak',
  templateUrl: './speak.component.html',
  styleUrls: ['./speak.component.css']
})
export class SpeakComponent implements OnInit {


  @Input() wordsToBeSpoken:string;
@Output() onSpeech = new EventEmitter;
@Input() @Output() sampleNgModel;

  constructor() { }

  ngOnInit() {
  }

}
