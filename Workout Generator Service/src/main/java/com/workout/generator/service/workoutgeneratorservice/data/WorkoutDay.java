package com.workout.generator.service.workoutgeneratorservice.data;

import java.util.List;

public class WorkoutDay {

    private List<WorkoutDetails> workoutDetailsList;
    private WorkoutType workoutType;

    public WorkoutDay(WorkoutType workoutType){
        this.workoutType = workoutType;
    }

    public void addWorkoutDetails(WorkoutDetails WorkoutDetails){
        if(!workoutDetailsList.contains(WorkoutDetails)) {
            workoutDetailsList.add(WorkoutDetails);
        }
    }
}
