"use strict";
exports.__esModule = true;
var Movie = /** @class */ (function () {
    function Movie(title, overview, releaseDate, id, rating, url) {
        this.title = title;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.id = id;
        this.rating = rating;
        this.url = url;
    }
    Movie.prototype.getTitle = function () {
        return this.title;
    };
    Movie.prototype.getReleaseDate = function () {
        return this.releaseDate;
    };
    Movie.prototype.getPosterUrl = function () {
        return this.url;
    };
    Movie.prototype.getOverview = function () {
        return this.overview;
    };
    Movie.prototype.getRating = function () {
        return this.rating;
    };
    Movie.prototype.getId = function () {
        return this.id;
    };
    return Movie;
}());
exports.Movie = Movie;
