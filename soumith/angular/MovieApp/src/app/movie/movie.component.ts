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


  }

}
