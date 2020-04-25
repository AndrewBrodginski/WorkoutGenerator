package com.workout.generator.weakgeak.repo;

import com.workout.generator.weakgeak.entity.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

}


