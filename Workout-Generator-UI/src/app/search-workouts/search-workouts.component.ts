import { Component, OnInit } from '@angular/core';
import {Workout} from '../workout';
import {WorkoutService} from '../workout.service';

@Component({
  selector: 'app-search-workouts',
  templateUrl: './search-workouts.component.html',
  styleUrls: ['./search-workouts.component.css']
})
export class SearchWorkoutsComponent implements OnInit {

  type: string;
  workouts: Workout[];

  constructor(private dataService: WorkoutService) { }

  ngOnInit() {
    this.type = '0';
  }

  private searchWorkouts() {
    this.workouts = [];
    this.dataService.getWorkoutsByType(this.type)
    .subscribe(workouts => this.workouts = workouts);
  }

  onSubmit() {
    this.searchWorkouts();
  }

}
