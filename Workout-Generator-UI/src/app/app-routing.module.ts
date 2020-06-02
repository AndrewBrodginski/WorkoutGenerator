import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { WorkoutListComponent } from './workout-list/workout-list.component';
import { CreateWorkoutComponent } from './create-workout/create-workout.component';
import { SearchWorkoutsComponent } from './search-workouts/search-workouts.component';

const routes: Routes = [
  { path: '', redirectTo: 'customer', pathMatch: 'full' },
  { path: 'workout', component: WorkoutListComponent },
  { path: 'add', component: CreateWorkoutComponent },
  { path: 'findbytype', component: SearchWorkoutsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
