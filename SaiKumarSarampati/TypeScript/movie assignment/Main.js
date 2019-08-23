"use strict";
exports.__esModule = true;
var data_1 = require("./data");
var Movie_1 = require("./Movie");
var Movies = [];
var i;
for (i = 0; i < data_1.data.length; i++) {
    var m = data_1.data[i];
    var mv = new Movie_1.Movie(m.title, m.overview, m.release_date, m.id, m.vote_average, m.poster_path);
    // console.log(mv);
    Movies.push(mv);
}
for (i = 0; i < Movies.length; i++) {
    var mv = Movies[i];
    console.log(mv.getTitle());
}
//console.log(Movies)
Movies.forEach(function (m) {
    return console.log(m.getId(), m.getTitle());
});
