import {Component, inject, OnInit} from '@angular/core';
import {GameService} from '../service/game.service';
import {OrderFormComponent} from '../order-form/order-form.component';

@Component({
  selector: 'app-checkout',
  imports: [
    OrderFormComponent
  ],
  templateUrl: './checkout.component.html',
  styleUrl: './checkout.component.css'
})
export class CheckoutComponent implements OnInit {

  gameService = inject(GameService);
  gamesToRent: any = [];

  ngOnInit() {
    this.gamesToRent = this.gameService.getSelectedGames();
  }

}
