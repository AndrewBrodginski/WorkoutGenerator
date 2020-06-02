package com.workout.generator.service.workoutgeneratorservice.repo;

import com.workout.generator.service.workoutgeneratorservice.data.Workout;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {
    List<Workout> findAllByType(String type);

}