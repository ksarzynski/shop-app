import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/ProductService/product.service';
import {ComputerCase} from '../../model/ComputerCase/computer-case';

@Component({
  selector: 'app-computercase',
  templateUrl: './computercase.component.html',
  styleUrls: ['./computercase.component.css']
})
export class ComputercaseComponent implements OnInit {

  computerCases: ComputerCase[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAllComputerCases().subscribe(data => this.computerCases = data);
  }
}
