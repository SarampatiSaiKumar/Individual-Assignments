export class Movie{

    
    constructor(
        public title:string, public overview:string, public releaseDate:string, public id:number, public rating:number, public url:string)
        {
            
        }

    getTitle(): string{
        return this.title;
    }

    getReleaseDate(){
        return this.releaseDate;
    }

    getPosterUrl(){
        return this.url;
    }

    getOverview(){
        return this.overview;
    }

    getRating(){
        return this.rating;
    }

    getId(){
        return this.id;
    }
}