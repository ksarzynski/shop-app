import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/productService/product.service';
import {Cpu} from '../../model/cpu/cpu';

@Component({
  selector: 'app-cpu',
  templateUrl: './cpu.component.html',
  styleUrls: ['./cpu.component.css']
})
export class CpuComponent implements OnInit {

  cpus: Cpu[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.findAllCpus().subscribe(data => this.cpus = data);
  }
}
