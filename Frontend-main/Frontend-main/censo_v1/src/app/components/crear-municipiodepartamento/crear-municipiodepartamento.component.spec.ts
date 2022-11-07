import {ComponentFixture, TestBed} from '@angular/core/testing';

import {CrearMunicipiodepartamentoComponent} from './crear-municipiodepartamento.component';

describe('CrearMunicipiodepartamentoComponent', () => {
  let component: CrearMunicipiodepartamentoComponent;
  let fixture: ComponentFixture<CrearMunicipiodepartamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CrearMunicipiodepartamentoComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(CrearMunicipiodepartamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
