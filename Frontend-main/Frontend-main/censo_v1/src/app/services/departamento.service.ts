import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Departamento } from '../models/departamento';
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class DepartamentoService {

  private baseURL = "http://localhost:8080/poblacion/v1/listarDepartamento";

  constructor(private httpClient : HttpClient) { }

  obtenerListaDepartamentos(): Observable<Departamento[]> {
    return this.httpClient.get<Departamento[]>(`${this.baseURL}`);
  }
  
}
