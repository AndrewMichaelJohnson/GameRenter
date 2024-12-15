import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {GameResult} from '../interface/gameResult';
import {Game} from '../interface/game';

@Injectable({
  providedIn: 'root'
})
export class GameService {

  selectedGames = new Set<Game>();

  constructor(private http: HttpClient) {}

  searchGames(searchTerm: string): Observable<GameResult>{
    return this.http.get<GameResult>('http://localhost:8080' + '/v1/games/searchgames/' + searchTerm);
  }

  addGameToSelected(game: Game){
    this.selectedGames.add(game);
  }

  removeGameFromSelected(game: Game) {
    this.selectedGames.delete(game);
  }

  hasSelectedGame(game: Game) {
    return this.selectedGames.has(game);
  }

  getSelectedGames(): Set<Game> {
    console.log("Returning selected games: " + this.selectedGames);
    return this.selectedGames;
  }

  clearSelections(): void{
    this.selectedGames.clear();
  }

  printList() {
    console.log("Printing set");
    this.selectedGames.forEach(function(value: Game){console.log(value)})
  }

  getListLength(): number{
    return this.selectedGames.size;
  }

}
