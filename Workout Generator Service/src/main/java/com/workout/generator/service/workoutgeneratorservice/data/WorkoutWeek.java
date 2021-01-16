package com.workout.generator.service.workoutgeneratorservice.data;

import java.util.List;

public class WorkoutWeek {

    private List<WorkoutWeek> workoutWeekList;
    private int weekNumber;

    public WorkoutWeek(int weekNumber){
        this.weekNumber = weekNumber;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    private int getRandomNumber(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
