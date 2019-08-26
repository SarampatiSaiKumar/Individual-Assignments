import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-builtin-pipes',
  templateUrl: './builtin-pipes.component.html',
  styleUrls: ['./builtin-pipes.component.css']
})
export class BuiltinPipesComponent implements OnInit {

  title= "title anta ga."
  person;
  constructor() {
    
   }

  ngOnInit() {
    this.person= new Person()
    this.person.name="Rahul"
    this.person.age=22

  }

}

class Person{
  name:string;
  age:number;


}

