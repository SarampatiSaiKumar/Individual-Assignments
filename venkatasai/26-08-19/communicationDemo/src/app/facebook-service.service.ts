import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FacebookServiceService {

  constructor() { }
  private fbPostObj:fbPosts=new fbPosts();

  getAllPosts(pUser:string){
    var allPosts:fbPosts[] = this.fbPostObj.getAllPosts();
    var _userPosts = [];
    allPosts.forEach(item => {
    if(item.username == pUser){
    _userPosts.push(item);
    }
    }) ;
    return _userPosts;
    }
}

class fbPosts {
  username:string;
  postTitle:string;
  postDescription:string;
  private _posts:fbPosts[]=[];
  
  constructor() {
  
  }
  
  getAllPosts():fbPosts[]{
    if(this._posts.length==0){
    var _post = new fbPosts();
  _post.postTitle ="first post";
  _post.username = 'subhash';
  _post.postDescription='subhash first flight';
  this._posts.push(_post);
  _post = new fbPosts();
  _post.postTitle ="title ravi";
  _post.username = 'ravi';
  _post.postDescription = 'ravi first salary';
  this._posts.push(_post);
    }
    return this._posts;
  }
  }
  