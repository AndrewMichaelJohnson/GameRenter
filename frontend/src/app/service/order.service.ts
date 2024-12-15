import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) {}

  sendOrder(customerOrder: any): Observable<any>{
    return this.http.post('http://localhost:8080/v1/rent', customerOrder);
  }


}
