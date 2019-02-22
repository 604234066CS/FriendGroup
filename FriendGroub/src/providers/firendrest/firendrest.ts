import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpClient } from '@angular/common/http';
import { Friend } from '../../models/friend.model';



@Injectable()
export class FriendrestProvider {

  private url:string="https://raw.githubusercontent.com/604234066CS/MyFriend/master/json"

  constructor(public http : HttpClient) {
    console.log('Hello FriendrestProvider Provider');
  }

  getBookList():Observable<any>{
    return this.http.get<Friend>(this.url);
  }
  getFriendList():Observable<any>{
    return this.http.get<Friend>(this.url);
  }

}