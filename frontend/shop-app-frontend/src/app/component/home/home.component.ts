import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/ProductService/product.service';
import {Product} from '../../model/Product/product';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-home-component',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  products: Product[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAll().subscribe(data => this.products = data);
  }
}
