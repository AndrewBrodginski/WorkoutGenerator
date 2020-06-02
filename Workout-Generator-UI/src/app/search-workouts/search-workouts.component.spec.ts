import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchWorkoutsComponent } from './search-workouts.component';

describe('SearchWorkoutsComponent', () => {
  let component: SearchWorkoutsComponent;
  let fixture: ComponentFixture<SearchWorkoutsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchWorkoutsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchWorkoutsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
