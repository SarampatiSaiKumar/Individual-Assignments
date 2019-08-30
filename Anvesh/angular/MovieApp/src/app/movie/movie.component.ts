import { Component, OnInit } from '@angular/core';
import {Movie} from './Movie'
import {data} from './data'
import { from } from 'rxjs';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent  {
  public Movies : Movie[] = [];
constructor(){

  this.putData();
}

  putData() { 
  for( var i=0; i<data.length ; i++ )
  {
    var m =data[i];
    var mv:Movie= new Movie(m.title,m.overview,m.release_date ,m.id,m.vote_average,m.poster_path);
   // console.log(mv);
    this.Movies.push(mv);
}

for( i=0;i<this.Movies.length;i++){
    var mv:Movie =this.Movies[i]
    
   console.log(mv.getTitle());
    
}
//console.log(Movies)
this.Movies.forEach((m) =>
     console.log(m.getId(),m.getTitle())
);
  }

}
