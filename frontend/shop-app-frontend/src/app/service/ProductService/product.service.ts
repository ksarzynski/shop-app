import {Observable} from 'rxjs';
import {Product} from '../../model/Product/product';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private readonly productControllerUrl: string;

  constructor(private http: HttpClient) {
    this.productControllerUrl = 'http://localhost:8080/products';
  }

  public findAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.productControllerUrl);
  }
}
