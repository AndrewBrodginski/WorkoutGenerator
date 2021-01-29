package com.workout.generator.service.workoutgeneratorservice.service;



import com.workout.generator.service.workoutgeneratorservice.data.WorkoutType;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Slf4j
public class WorkoutUtilitiesTest {

    private WorkoutUtilities workoutUtilities;

    @Before
    public void setUp() {
        workoutUtilities = new WorkoutUtilities();
    }

    @Test
    public void getRandomNumber_ZeroProvided_IntNotReturned(){
        int randomInt = workoutUtilities.getRandomNumber(0);
        assertNotNull(randomInt);
    }

    @Test
    public void getRandomWorkoutType_IsCalled_WorkoutTypeReturned(){
        WorkoutType workoutType = workoutUtilities.getRandomWorkoutType();

        assertNotNull(workoutType);
    }
}
