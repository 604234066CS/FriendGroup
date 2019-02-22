import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the FirendrestProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class FirendrestProvider {

  constructor(public http: HttpClient) {
    console.log('Hello FirendrestProvider Provider');
  }

}
