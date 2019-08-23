import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  public cityName: string  ;
  public stateName:string ;
public countryName:string;


constructor(){

  this.cityName="Guntur"
  this.stateName="Andhra pradesh"
  this.countryName="India"
}

onClick(pCity,pState,pCountry){
  this.cityName=pCity
  this.stateName=pState
  this.countryName=pCountry
  
}
  ngOnInit() {
  }

}
