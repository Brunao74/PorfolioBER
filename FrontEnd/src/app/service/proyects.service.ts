import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proyects } from '../model/proyects';

@Injectable({
  providedIn: 'root'
})
export class ProyectsService {
  URL = 'http://localhost:8080/proyects/';

  constructor(private httpClient : HttpClient) { }

  public lista(): Observable<Proyects[]>{
    return this.httpClient.get<Proyects[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Proyects>{
    return this.httpClient.get<Proyects>(this.URL + `detail/${id}`);
  }

  public save(educacion: Proyects): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', educacion);
  }

  public update(id: number, educacion: Proyects): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, educacion);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}