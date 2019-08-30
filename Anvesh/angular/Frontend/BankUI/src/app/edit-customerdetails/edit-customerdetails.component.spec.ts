import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditCustomerdetailsComponent } from './edit-customerdetails.component';

describe('EditCustomerdetailsComponent', () => {
  let component: EditCustomerdetailsComponent;
  let fixture: ComponentFixture<EditCustomerdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditCustomerdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditCustomerdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
