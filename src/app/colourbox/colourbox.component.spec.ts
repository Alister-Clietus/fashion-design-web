import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ColourboxComponent } from './colourbox.component';

describe('ColourboxComponent', () => {
  let component: ColourboxComponent;
  let fixture: ComponentFixture<ColourboxComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ColourboxComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ColourboxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
