import { Routes } from '@angular/router';
import { OrderComponent } from './order/order';


export const routes: Routes = [
  { path: 'orders', component: OrderComponent },
  { path: '', redirectTo: 'orders', pathMatch: 'full' }
];
