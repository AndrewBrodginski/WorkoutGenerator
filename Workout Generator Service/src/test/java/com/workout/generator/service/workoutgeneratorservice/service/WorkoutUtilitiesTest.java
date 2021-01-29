package com.workout.generator.service.workoutgeneratorservice.service;



import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class WorkoutUtilitiesTest {

    private WorkoutUtilities workoutUtilities = new WorkoutUtilities();

    @Before
    public void setUp() {

    }

    @Test
    public void getRandomNumber_ZeroProvided_IntNotReturned(){
        int randomInt = workoutUtilities.getRandomNumber(0);
        assertNotNull(randomInt);
    }
}
