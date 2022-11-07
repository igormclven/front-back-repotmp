import { Injectable } from '@angular/core';
import { Informacionpoblacion } from '../models/informacionpoblacion';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class InformacionpoblacionService {

  private baseURL = "http://localhost:8080/poblacion/v1/listarInformacionPoblacion";
  private urlCrear = "http://localhost:8080/poblacion/v1/crearInformacionPoblacion";

  constructor(private httpClient : HttpClient) { }

  obtenerListaInformacionPoblacion(): Observable<Informacionpoblacion[]> {
    return this.httpClient.get<Informacionpoblacion[]>(`${this.baseURL}`);
  }

  registrarinformacionPoblacion(informacionPoblacion:Informacionpoblacion): Observable<Object>{
    //Asigna fecha actual
    informacionPoblacion.fecha = this.asignarFecha()
    return this.httpClient.post(`${this.urlCrear}`, informacionPoblacion)
  }

  // Funcion utilitaria que asigna la fecha actual con la zona horaria local donde se registra el nuevo dato
  asignarFecha(): string {
    let fecha = new Date
    let zonaHoraria = fecha.getTimezoneOffset()
    fecha = new Date(fecha.getTime()-(zonaHoraria*60*1000))
    return fecha.toISOString().split('T')[0]
  }
}


