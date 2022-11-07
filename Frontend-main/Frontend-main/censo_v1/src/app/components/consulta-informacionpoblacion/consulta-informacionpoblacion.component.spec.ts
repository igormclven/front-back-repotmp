import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaInformacionpoblacionComponent } from './consulta-informacionpoblacion.component';

describe('ConsultaInformacionpoblacionComponent', () => {
  let component: ConsultaInformacionpoblacionComponent;
  let fixture: ComponentFixture<ConsultaInformacionpoblacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaInformacionpoblacionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConsultaInformacionpoblacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
