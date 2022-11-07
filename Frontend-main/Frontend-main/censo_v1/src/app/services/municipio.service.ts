import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'
import { Municipio } from '../models/municipio';

@Injectable({
  providedIn: 'root'
})
export class MunicipioService {

  private baseURL = "http://localhost:8080/poblacion/v1/listarMunicipio";

  constructor(private httpClient : HttpClient) { }

  obtenerListaMunicipio(): Observable<Municipio[]> {
    return this.httpClient.get<Municipio[]>(`${this.baseURL}`);
  }
}
