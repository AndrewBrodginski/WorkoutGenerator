package com.workout.generator.service.workoutgeneratorservice.service;

import com.workout.generator.service.workoutgeneratorservice.data.Workout;
import com.workout.generator.service.workoutgeneratorservice.data.WorkoutCycle;
import com.workout.generator.service.workoutgeneratorservice.repo.WorkoutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkoutCycleService {

    @Autowired
    WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkoutByType(String type){
       return workoutRepository.findAllByType(type);
    }

    public WorkoutCycle getWorkoutCycle(){
        WorkoutCycle workoutCycle = new WorkoutCycle();

        return workoutCycle;
    }

}
