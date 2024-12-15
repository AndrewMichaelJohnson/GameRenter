import {Component, inject, OnInit} from '@angular/core';
import {DatePipe, NgIf} from '@angular/common';
import {FormControl, FormGroup, ReactiveFormsModule} from '@angular/forms';
import {OrderService} from '../service/order.service';
import {GameService} from '../service/game.service';
import {CompleteRental} from '../interface/complete-rental';

@Component({
  selector: 'app-order-form',
  imports: [
    NgIf,
    ReactiveFormsModule,
    DatePipe
  ],
  templateUrl: './order-form.component.html',
  styleUrl: './order-form.component.css'
})
export class OrderFormComponent implements OnInit  {
  showOrderForm: boolean = false;
  showOrderResult: boolean = false;
  orderService: OrderService = inject(OrderService);
  gameService: GameService = inject(GameService);
  completeRental: any;

  ngOnInit() {
    this.showOrderForm = this.gameService.getListLength() > 0;
  }

  orderForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    address: new FormControl(''),
    apartmentNumber: new FormControl(''),
    city: new FormControl(''),
    state: new FormControl(''),
    country: new FormControl(''),
    creditCard: new FormControl(''),
    zipCode: new FormControl(''),
  })

  postOrder() {
    let currentOrder: any = {  firstName: this.orderForm.value.firstName,
      lastName: this.orderForm.value.lastName,
      address: this.orderForm.value.address,
      apartmentNumber: this.orderForm.value.apartmentNumber,
      city: this.orderForm.value.city,
      state: this.orderForm.value.state,
      zipCode: this.orderForm.value.zipCode,
      country: this.orderForm.value.country,
      creditCardNumber: this.orderForm.value.creditCard,
      games: Array.from(this.gameService.getSelectedGames()),
    };

    this.orderService.sendOrder(currentOrder).subscribe(
      (rentalResult: CompleteRental)=> {
      this.completeRental = rentalResult;
      this.showOrderResult = true;
    }, (err: any) => {
        console.log("Something went wrong error:" + err);
      }

    );
  }


}
