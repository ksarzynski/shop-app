import {Observable} from 'rxjs';
import {Product} from '../../model/Product/product';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {ComputerCase} from '../../model/ComputerCase/computer-case';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private readonly productControllerUrl: string;
  private readonly computerCaseControllerUrl: string;

  constructor(private http: HttpClient) {
    this.productControllerUrl = 'http://localhost:8080/products';
    this.computerCaseControllerUrl = 'http://localhost:8080/computer-cases';
  }

  public findAllProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.productControllerUrl);
  }

  public findAllComputerCases(): Observable<ComputerCase[]> {
    return this.http.get<ComputerCase[]>(this.computerCaseControllerUrl);
  }
}
