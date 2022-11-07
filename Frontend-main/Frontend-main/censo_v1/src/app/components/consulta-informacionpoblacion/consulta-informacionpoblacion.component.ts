import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {Informacionpoblacion} from 'src/app/models/informacionpoblacion';
import {InformacionpoblacionService} from 'src/app/services/informacionpoblacion.service';
import {Departamento} from 'src/app/models/departamento';
import {Municipio} from 'src/app/models/municipio';
import {DepartamentoService} from 'src/app/services/departamento.service';
import {MunicipioService} from 'src/app/services/municipio.service';
import {MatAccordion} from "@angular/material/expansion";
import {FormControl, FormGroup, Validators} from "@angular/forms";


@Component({
  selector: 'app-consulta-informacionpoblacion',
  templateUrl: './consulta-informacionpoblacion.component.html',
  styleUrls: ['./consulta-informacionpoblacion.component.css']
})
export class ConsultaInformacionpoblacionComponent implements OnInit {
  //Accordeon
  panelOpenState = false;
  //Form
  form: FormGroup;
  //
  informacionPoblacion?: Informacionpoblacion [];
  pUrbana!: number;
  pRural!: number;
  municipio?: Municipio[];
  departamento?: Departamento[];
  departamentoSeleccionado?: any = {
    id_departamento: 0,
    nombre_departamento: ''
  };
  municipioSeleccionado?: any = {
    id_municipio: 0,
    nombre_municipio: ''
  };
  registroSeleccionado?: any = {
    id_registro: 0,
    fecha: ''
  };

  total: number = 0;

  constructor(private informacionPoblacionServicio: InformacionpoblacionService, private municipioService: MunicipioService,
              private departamentoService: DepartamentoService) {
  }


  ngOnInit(): void {
    this.obtenerDepartamentos();
    this.obtenerMunicipio();
    this.municipiosDelDepartamento(this.departamentoSeleccionado.id_departamento);
    this.obtenerInformacionPoblacion(this.municipioSeleccionado.id_municipio);

    this.form = new FormGroup({
      poblacion: new FormControl('', [Validators.required, Validators.min(1)])
    })
  }

  private obtenerMunicipio() {
    this.municipioService.obtenerListaMunicipio().subscribe(dato => {
      this.municipio = dato
      console.log(dato)
    });
  }

  private obtenerDepartamentos() {
    this.departamentoService.obtenerListaDepartamentos().subscribe(dato => {
      this.departamento = dato
    });
  }

  municipiosDelDepartamento(id_departamento: number) {
    console.log("id: departamento seleccionado: ", id_departamento);
    this.municipioService.obtenerListaMunicipio().subscribe((res: Municipio[]) => {
      this.municipio = res.filter(
        (res: Municipio) => res.codigo_departamento === id_departamento!)
    })
  }

  obtenerInformacionPoblacion(id_municipio: number) {
    console.log("id: Municipio Seleccionado: ", id_municipio);
    this.informacionPoblacionServicio.obtenerListaInformacionPoblacion().subscribe((res: Informacionpoblacion[]) => {
      this.informacionPoblacion = res.filter(
        (res: Informacionpoblacion) => res.codigo_municipio === id_municipio!)
      console.log(this.informacionPoblacion)
      this.informacionPoblacion.forEach((obj) =>{
        this.total = this.total + obj.total_poblacion;
      })
      //reset
      if(this.informacionPoblacion.length == 0){
        this.total = 0;
      }
      console.log(this.total)
    })
  }



}
