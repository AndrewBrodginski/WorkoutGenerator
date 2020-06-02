import {Component, Input, OnInit} from '@angular/core';
import {Workout} from '../workout';
import {WorkoutListComponent} from '../workout-list/workout-list.component';
import {WorkoutService} from '../workout.service';

@Component({
  selector: 'app-workout-details',
  templateUrl: './workout-details.component.html',
  styleUrls: ['./workout-details.component.css']
})
export class WorkoutDetailsComponent implements OnInit {

  @Input() workout: Workout;

  constructor(private workoutService: WorkoutService, private listComponent: WorkoutListComponent) { }

  ngOnInit() {
  }

  updateActive(isOlympic: boolean) {
    this.workoutService.updateWorkout(this.workout.id,
      { name: this.workout.name, type: this.workout.type, olympic: isOlympic })
    .subscribe(
      data => {
        console.log(data);
        this.workout = data as Workout;
      },
      error => console.log(error));
  }

  deleteWorkout() {
    this.workoutService.deleteWorkout(this.workout.id)
    .subscribe(
      data => {
        console.log(data);
        this.listComponent.reloadData();
      },
      error => console.log(error));
  }

}
