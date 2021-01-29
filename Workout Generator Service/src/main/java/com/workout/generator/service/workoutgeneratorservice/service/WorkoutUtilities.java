package com.workout.generator.service.workoutgeneratorservice.service;

import com.workout.generator.service.workoutgeneratorservice.data.WorkoutType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkoutUtilities {

    public void WorkoutUtilities(){

    }

    public WorkoutType getRandomWorkoutType(){
        List<WorkoutType> workoutTypeList = new ArrayList<>();
        workoutTypeList.addAll(Arrays.asList(WorkoutType.values()));
        int randomInt = getRandomNumber(workoutTypeList.size());
        return workoutTypeList.get(randomInt);
    }

    public int getRandomNumber(int maxLength){
        return (int) Math.random() * (maxLength - 0 + 1) + 0;
    }
}
