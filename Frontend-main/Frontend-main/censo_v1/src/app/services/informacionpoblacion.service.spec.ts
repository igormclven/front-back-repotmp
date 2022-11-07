import { TestBed } from '@angular/core/testing';

import { InformacionpoblacionService } from './informacionpoblacion.service';

describe('InformacionpoblacionService', () => {
  let service: InformacionpoblacionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InformacionpoblacionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
