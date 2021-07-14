import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComputercaseComponent } from './computercase.component';

describe('ComputercaseComponent', () => {
  let component: ComputercaseComponent;
  let fixture: ComponentFixture<ComputercaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComputercaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComputercaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
