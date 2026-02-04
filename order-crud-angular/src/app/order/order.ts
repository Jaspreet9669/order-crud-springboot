import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Order } from './order.model';

@Component({
  selector: 'app-order',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './order.html',
  styleUrls: ['./order.css']
})
export class OrderComponent {

  orders: Order[] = [];

  newOrder: Order = {
    productName: '',
    quantity: 1,
    price: 0
  };

  addOrder() {
    this.orders.push({ ...this.newOrder });
    this.newOrder = { productName: '', quantity: 1, price: 0 };
  }

  deleteOrder(index: number) {
    this.orders.splice(index, 1);
  }
}
