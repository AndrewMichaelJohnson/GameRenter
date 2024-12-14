import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GameService {
  games = ['The Legend of Zelda', 'Final Fantasy']

  searchGames(searchTerm: string) {
    console.log("Hit function");
    var  xhr = new  XMLHttpRequest();

    xhr.open('GET', 'localhost:8080' + '/v1/games/searchbyname/' + searchTerm);
    xhr.onload = function() {
      console.log("status: " + xhr.status);
      console.log("xhr content: " + xhr.response);
    }
    xhr.send();
    return this.games;
  }

  getGame(id: number){
    return this.games[id];
  }
  constructor() { }
}
