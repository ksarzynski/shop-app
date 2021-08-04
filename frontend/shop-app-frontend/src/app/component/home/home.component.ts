import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/productService/product.service';
import {Product} from '../../model/product/product';

@Component({
  selector: 'app-home-component',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  products: Product[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAllProducts().subscribe(data => this.products = data);
  }
}
