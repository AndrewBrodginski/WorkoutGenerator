package com.workout.generator.service.workoutgeneratorservice.data;

import java.util.List;

public class WorkoutCycle {

    private List<WorkoutWeek> workoutWeekList;
    private int numberOfWeeksInCycle;
    private int numberOfDaysAtGym;

    public WorkoutCycle(int numberOfWeeksInCycle, int numberOfDaysAtGym){
        this.numberOfWeeksInCycle =numberOfWeeksInCycle;
        this.numberOfDaysAtGym = numberOfDaysAtGym;
    }

    public void addWorkoutWeek(WorkoutWeek workoutWeek){
        if(!workoutWeekList.contains(workoutWeek)) {
            workoutWeekList.add(workoutWeek);
        }
    }

}
