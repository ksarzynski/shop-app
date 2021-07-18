import {Observable} from 'rxjs';
import {Product} from '../../model/Product/product';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {ComputerCase} from '../../model/ComputerCase/computer-case';
import {Cpu} from "../../model/cpu/cpu";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private readonly productControllerUrl: string;
  private readonly computerCaseControllerUrl: string;
  private readonly cpuControllerUrl: string;

  constructor(private http: HttpClient) {
    this.productControllerUrl = 'http://localhost:8080/products';
    this.computerCaseControllerUrl = 'http://localhost:8080/computer-cases';
    this.cpuControllerUrl = 'http://localhost:8080/cpus';
  }

  public findAllProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.productControllerUrl);
  }

  public findAllComputerCases(): Observable<ComputerCase[]> {
    return this.http.get<ComputerCase[]>(this.computerCaseControllerUrl);
  }

  public findProduct(productId: string): Observable<Product> {
    return this.http.get<Product>(`${this.productControllerUrl}/${productId}`);
  }

  public findComputerCase(productId: string): Observable<ComputerCase> {
    return this.http.get<ComputerCase>(`${this.computerCaseControllerUrl}/${productId}`);
  }

  public findAllCpus(): Observable<Cpu[]> {
    return this.http.get<Cpu[]>(this.cpuControllerUrl);
  }

  public findCpu(productId: string): Observable<Cpu> {
    return this.http.get<Cpu>(`${this.cpuControllerUrl}/${productId}`);
  }
}
