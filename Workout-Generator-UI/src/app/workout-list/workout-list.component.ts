import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { WorkoutService } from '../workout.service';
import { Workout } from '../workout';

@Component({
  selector: 'app-workout-list',
  templateUrl: './workout-list.component.html',
  styleUrls: ['./workout-list.component.css']
})
export class WorkoutListComponent implements OnInit {

  workouts: Observable<Workout[]>;

  constructor(private workoutService: WorkoutService) { }

  ngOnInit() {
    this.reloadData();
  }

  deleteWorkouts() {
    this.workoutService.deleteAll()
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log('ERROR: ' + error));
  }

  reloadData() {
    this.workouts = this.workoutService.getWorkoutsList();
  }

}
