package com.workout.generator.service.workoutgeneratorservice.service;

import com.workout.generator.service.workoutgeneratorservice.data.Workout;
import com.workout.generator.service.workoutgeneratorservice.data.WorkoutCycle;

import com.workout.generator.service.workoutgeneratorservice.repo.WorkoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    private WorkoutCycle workoutCycle;
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public List<Workout> getAllWorkoutByType(String type){
       return workoutRepository.findAllByType(type);
    }

    public void deleteAll() {
        workoutRepository.deleteAll();
    }

    public void deleteById(long id) {
        workoutRepository.findById(id);
    }

    public Workout save(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout findById(long id) {
        return workoutRepository.findWorkoutById(id);
    }

    public List<Workout> findAll() {
        return workoutRepository.findAll();
    }

    private WorkoutCycle createWorkoutCycle(int numberOfWeeksInCycle, int numberOfDaysAtGym){
        workoutCycle = new WorkoutCycle(numberOfWeeksInCycle, numberOfDaysAtGym);

        return workoutCycle;
    }



}
