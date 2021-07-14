import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/Product/product';
import {ProductService} from '../../service/ProductService/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products: Product[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAllProducts().subscribe(data => this.products = data);
  }
}
