package com.workout.generator.service.workoutgeneratorservice.data;

import java.util.List;

public class WorkoutCycle {

    private List<WorkoutWeek> workoutWeekList;
    private int numberOfWeeksInCycle;

    public WorkoutCycle(int numberOfWeeksInCycle){
        this.numberOfWeeksInCycle =numberOfWeeksInCycle;
    }

}
