import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/ProductService/product.service';
import {ComputerCase} from '../../model/ComputerCase/computer-case';

@Component({
  selector: 'app-computercase',
  templateUrl: './computer-case.component.html',
  styleUrls: ['./computer-case.component.css']
})
export class ComputerCaseComponent implements OnInit {

  computerCases: ComputerCase[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAllComputerCases().subscribe(data => this.computerCases = data);
  }
}
