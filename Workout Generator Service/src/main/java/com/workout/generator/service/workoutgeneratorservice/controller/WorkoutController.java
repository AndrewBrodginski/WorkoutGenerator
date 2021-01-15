package com.workout.generator.service.workoutgeneratorservice.controller;

import com.workout.generator.service.workoutgeneratorservice.data.Workout;
import com.workout.generator.service.workoutgeneratorservice.repo.WorkoutRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class WorkoutController {

    final WorkoutRepository repository;

    public WorkoutController(WorkoutRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/workouts")
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        List<Workout> customers = new ArrayList<>();
        try {
            repository.findAll().forEach(customers::add);

            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/workouts/{id}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable("id") long id) {
        Optional<Workout> workoutData = repository.findById(id);

        if (workoutData.isPresent()) {
            return new ResponseEntity<>(workoutData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/workouts")
    public ResponseEntity<Workout> postWorkout(@RequestBody Workout workout) {
        try {
            Workout _customer = repository.save(new Workout(workout.getName(), workout.getType(), workout.isOlympic()));
            return new ResponseEntity<>(_customer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/workouts/{id}")
    public ResponseEntity<HttpStatus> deleteWorkout(@PathVariable("id") long id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/workouts")
    public ResponseEntity<HttpStatus> deleteAllWorkouts() {
        try {
            repository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }


}
