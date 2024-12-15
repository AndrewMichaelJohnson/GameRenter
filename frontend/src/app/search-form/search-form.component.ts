import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { GameService } from '../service/game.service';
import { GameResult } from '../interface/gameResult';
import { Game } from '../interface/game';
import { NgClass } from '@angular/common';
import {RouterLink, RouterOutlet} from '@angular/router';


@Component({
  selector: 'app-search-form',
  imports: [ReactiveFormsModule, NgClass, RouterOutlet, RouterLink],
  templateUrl: './search-form.component.html',
  styleUrl: './search-form.component.css'
})
export class SearchFormComponent {
  gameService = inject(GameService);

  searchForm = new FormGroup({
    gameName: new FormControl(''),
  })
  singleGameForm = new FormGroup({
    gameId: new FormControl(''),
  })


  data: any = null;
  isLoading = true;
  error: string | null = null;

  findGames() {
    this.data = [];
    this.gameService.searchGames(this.searchForm.value.gameName ?? '').subscribe(
      (gameResult: GameResult) => {
        console.log("I am getting back the response it is: " + gameResult.results);
        console.log("First item is : " + gameResult.results[0].name + "url: ");
        this.data = gameResult.results;
        this.data.forEach((item: { name: any; }) => {
          console.log("name check" + item.name);
        });
        this.isLoading = false;
      },
      (err) => {
        this.error = 'An error occurred: ' + err.message; // On error, store error message
        this.isLoading = false;
      }
    );
  }

  selectGame(game: Game){
    console.log("Got my clicky");
    console.log("Name from clicky" + game.name);
    //game.isClicked ? game.isClicked = false : game.isClicked = true;

    //If the game is selected already we need to remove it
    if(this.gameService.hasSelectedGame(game)) {
      this.gameService.removeGameFromSelected(game);
      game.isClicked = false;
    } else {
      this.gameService.addGameToSelected(game);
      game.isClicked = true;
    }

    this.gameService.printList();

  }

}
