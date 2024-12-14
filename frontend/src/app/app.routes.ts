import { Routes } from '@angular/router';
import { CheckoutComponent } from './checkout/checkout.component';
import {SearchFormComponent} from './search-form/search-form.component';

export const routes: Routes = [
  {
    path: 'checkout',
    component: CheckoutComponent,
    title: 'Checkout your games!'
  },
  {
    path: 'search',
    component: SearchFormComponent,
    title: 'Search for your games!'
  }
];
