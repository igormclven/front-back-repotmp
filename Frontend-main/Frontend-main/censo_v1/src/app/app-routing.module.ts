import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConsultaInformacionpoblacionComponent } from './components/consulta-informacionpoblacion/consulta-informacionpoblacion.component';
import { CrearMunicipiodepartamentoComponent } from './components/crear-municipiodepartamento/crear-municipiodepartamento.component';

const routes: Routes = [
  {path : 'CrearRegistros', component:CrearMunicipiodepartamentoComponent},
  {path : 'ConsultarRegistros', component:ConsultaInformacionpoblacionComponent},
  {path : '',redirectTo:'CrearRegistros', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
