import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Redes } from '../model/redes';

@Injectable({
  providedIn: 'root'
})
export class RedesService {
  URL = 'http://localhost:8080/redes/';

  constructor(private httpClient : HttpClient) { }

  public lista(): Observable<Redes[]>{
    return this.httpClient.get<Redes[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Redes>{
    return this.httpClient.get<Redes>(this.URL + `detail/${id}`);
  }

  public save(educacion: Redes): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', educacion);
  }

  public update(id: number, educacion: Redes): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, educacion);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}