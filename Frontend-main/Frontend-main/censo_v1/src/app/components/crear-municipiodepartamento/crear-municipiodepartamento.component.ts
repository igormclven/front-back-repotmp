import {Component, OnInit, Inject} from '@angular/core';
import {Departamento} from 'src/app/models/departamento';
import {Informacionpoblacion} from 'src/app/models/informacionpoblacion';
import {Municipio} from 'src/app/models/municipio';
import {DepartamentoService} from 'src/app/services/departamento.service';
import {MunicipioService} from 'src/app/services/municipio.service';
import {InformacionpoblacionService} from 'src/app/services/informacionpoblacion.service';
import {Router} from '@angular/router';
import {MatDialog} from '@angular/material/dialog';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-crear-municipiodepartamento',
  templateUrl: './crear-municipiodepartamento.component.html',
  styleUrls: ['./crear-municipiodepartamento.component.css']
})
export class CrearMunicipiodepartamentoComponent implements OnInit {
  //form
  form: FormGroup;
  pUrbana!: number;
  pRural!: number;
  municipio?: Municipio[];
  departamento?: Departamento[];
  departamentoSeleccionado?: any = {
    id_departamento: 0,
    nombre_departamento: ''
  };

  infomacionpoblacion: Informacionpoblacion = new Informacionpoblacion();
  alerta: MatSnackBar;
  error: number;

  constructor(private municipioService: MunicipioService, private informacionPoblacionServicio: InformacionpoblacionService,
              private departamentoService: DepartamentoService, private router: Router, public dialogo: MatDialog) {
  }

  ngOnInit(): void {
    this.obtenerDepartamentos();
    this.obtenerMunicipio();
    this.municipiosDelDepartamento(this.departamentoSeleccionado.id_departamento);
    this.form = new FormGroup({
      poblacion_h_r: new FormControl('', [Validators.required, Validators.min(1)]),
      poblacion_m_r: new FormControl('', [Validators.required, Validators.min(1)]),
      poblacion_h_u: new FormControl('', [Validators.required, Validators.min(1)]),
      poblacion_m_u: new FormControl('', [Validators.required, Validators.min(1)]),
      departamento: new FormControl('', [Validators.required]),
      municipio: new FormControl('', [Validators.required]),
    })
  }

  private obtenerDepartamentos() {
    this.departamentoService.obtenerListaDepartamentos().subscribe(dato => {
      this.departamento = dato
      console.log(dato)
    });
  }

  private obtenerMunicipio() {
    this.municipioService.obtenerListaMunicipio().subscribe(dato => {
      this.municipio = dato
      console.log(dato)
    });
  }

  municipiosDelDepartamento(id_departamento: number) {
    console.log("id: departamento seleccionado: ", id_departamento);
    this.municipioService.obtenerListaMunicipio().subscribe((res: Municipio[]) => {
      this.municipio = res.filter(
        (res: Municipio) => res.codigo_departamento === id_departamento!)
      console.log(this.municipio)
    })
  }

  crearRegistro(): void {
    let alert: MatSnackBar;
    console.log(this.infomacionpoblacion);
    this.informacionPoblacionServicio.registrarinformacionPoblacion(this.infomacionpoblacion).subscribe(dato => {
      console.log(dato);
      window.location.reload();
    }, error => {
      console.log(error);
      this.error = 1;
    });
  }

  public checkError = (controlName: string, errorName: string) => {
    return this.form.controls[controlName].hasError(errorName);
  }
}
