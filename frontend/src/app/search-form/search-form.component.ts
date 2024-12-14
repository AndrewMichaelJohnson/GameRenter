import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { GameService } from '../service/game.service';

@Component({
  selector: 'app-search-form',
  imports: [ReactiveFormsModule],
  templateUrl: './search-form.component.html',
  styleUrl: './search-form.component.css'
})
export class SearchFormComponent {
  searchForm = new FormGroup({
    gameName: new FormControl(''),
    gamePlatform: new FormControl(''),
  })
  findGames() {
    return this.gameService.searchGames("zelda");
    //alert(
      //this.searchForm.value.gameName + ' | ' + this.searchForm.value.gamePlatform
    //)
  }
  gameService = inject(GameService);
}
