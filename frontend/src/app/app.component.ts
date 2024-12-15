import { Component } from '@angular/core';
import {RouterLink, RouterOutlet} from '@angular/router';
import {SearchFormComponent} from './search-form/search-form.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet, SearchFormComponent, RouterLink, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
}
