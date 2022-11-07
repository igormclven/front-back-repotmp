import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatTabsModule} from '@angular/material/tabs';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material/card'
import { MatInputModule } from '@angular/material/input'
import { MatDividerModule } from '@angular/material/divider';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';
import { MatSliderModule } from '@angular/material/slider';
import { CrearMunicipiodepartamentoComponent } from './components/crear-municipiodepartamento/crear-municipiodepartamento.component';
import { ConsultaInformacionpoblacionComponent } from './components/consulta-informacionpoblacion/consulta-informacionpoblacion.component';
import { MatDialogModule } from '@angular/material/dialog';
import {MatExpansionModule} from "@angular/material/expansion";
import {MatListModule} from "@angular/material/list";
import {MatGridListModule} from "@angular/material/grid-list";
import {MatIconModule} from "@angular/material/icon";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatSidenavModule} from "@angular/material/sidenav";
@NgModule({
  declarations: [
    AppComponent,
    CrearMunicipiodepartamentoComponent,
    ConsultaInformacionpoblacionComponent
  ],
  imports: [
    BrowserModule,
    MatDialogModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatInputModule,
    MatFormFieldModule,
    MatSelectModule,
    MatButtonModule,
    MatTableModule,
    FormsModule,
    MatSliderModule,
    MatTabsModule,
    MatDividerModule,
    MatExpansionModule,
    MatListModule,
    ReactiveFormsModule,
    MatGridListModule,
    MatIconModule,
    MatToolbarModule,
    MatSidenavModule,
  ],
  entryComponents: [CrearMunicipiodepartamentoComponent],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
