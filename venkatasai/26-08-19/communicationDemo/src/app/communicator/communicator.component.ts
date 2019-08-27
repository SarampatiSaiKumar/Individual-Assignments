import { Component, OnInit } from '@angular/core';
import { FacebookServiceService } from '../facebook-service.service';
import { TwitterService } from '../twitter.service';

@Component({
  selector: 'app-communicator',
  templateUrl: './communicator.component.html',
  styleUrls: ['./communicator.component.css']
})
export class CommunicatorComponent implements OnInit {

  constructor(public pFbService: FacebookServiceService ,
    public pTwitterService: TwitterService) {
    
   }

   userPosts =[]
  ngOnInit() {
  }

  getFbPosts(pUser:string){
    this.userPosts=this.pFbService.getAllPosts(pUser);
  }

}
