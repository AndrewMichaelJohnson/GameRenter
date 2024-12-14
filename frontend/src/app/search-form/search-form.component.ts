import { Component } from '@angular/core';
import {FormControl, FormGroup, ReactiveFormsModule} from '@angular/forms';

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
    alert(
      this.searchForm.value.gameName + ' | ' + this.searchForm.value.gamePlatform
    )
  }
}
