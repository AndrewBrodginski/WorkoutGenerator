package com.workout.generator.service.workoutgeneratorservice.data;

import java.util.List;

public class WorkoutWeek {

    private List<WorkoutDay> workoutDayList;
    private int weekNumber;

    public WorkoutWeek(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public void addWorkoutDetails(WorkoutDay WorkoutDay){
        if(!workoutDayList.contains(WorkoutDay)) {
            workoutDayList.add(WorkoutDay);
        }
    }
}
