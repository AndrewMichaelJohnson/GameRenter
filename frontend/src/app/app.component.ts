import { Component } from '@angular/core';
import {RouterLink, RouterOutlet} from '@angular/router';
import {SearchFormComponent} from './search-form/search-form.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, SearchFormComponent, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
