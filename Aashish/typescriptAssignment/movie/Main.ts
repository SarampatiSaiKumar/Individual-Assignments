import {data} from './data';
import { Movie } from './Movie';

var Movies : Movie[]=[];
var i;

for( i=0;i<data.length;i++){
    var m =data[i]
    var mv:Movie= new Movie(m.title,m.overview,m.release_date ,m.id,m.vote_average,m.poster_path);
   
    Movies.push(mv);
}

for( i=0;i<Movies.length;i++){
    var mv:Movie =Movies[i]
    
   console.log(mv.getTitle());
    
}

Movies.forEach((m) =>
     console.log(m.getId(),m.getTitle())
);