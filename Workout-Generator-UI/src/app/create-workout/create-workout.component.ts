import { Component, OnInit } from '@angular/core';
import {Workout} from '../workout';
import {WorkoutService} from '../workout.service';

@Component({
  selector: 'app-create-workout',
  templateUrl: './create-workout.component.html',
  styleUrls: ['./create-workout.component.css']
})
export class CreateWorkoutComponent implements OnInit {

  workout: Workout = new Workout();
  submitted = false;

  constructor(private workoutService: WorkoutService) { }

  ngOnInit() {
  }

  newWorkout(): void {
    this.submitted = false;
    this.workout = new Workout();
  }

  save() {
    this.workoutService.createWorkout(this.workout)
    .subscribe(
      data => {
        console.log(data);
        this.submitted = true;
      },
      error => console.log(error));
    this.workout = new Workout();
  }

  onSubmit() {
    this.save();
  }
}
