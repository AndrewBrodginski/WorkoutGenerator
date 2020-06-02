import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateWorkoutComponent } from './create-workout/create-workout.component';
import { WorkoutDetailsComponent } from './workout-details/workout-details.component';
import { WorkoutListComponent } from './workout-list/workout-list.component';
import { SearchWorkoutsComponent } from './search-workouts/search-workouts.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateWorkoutComponent,
    WorkoutDetailsComponent,
    WorkoutListComponent,
    SearchWorkoutsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
