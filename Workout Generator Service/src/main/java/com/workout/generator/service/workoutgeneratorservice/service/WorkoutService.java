package com.workout.generator.service.workoutgeneratorservice.service;

import com.workout.generator.service.workoutgeneratorservice.data.Workout;

import com.workout.generator.service.workoutgeneratorservice.repo.WorkoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public List<Workout> getAllWorkoutByType(String type){
       return workoutRepository.findAllByType(type);
    }




}
