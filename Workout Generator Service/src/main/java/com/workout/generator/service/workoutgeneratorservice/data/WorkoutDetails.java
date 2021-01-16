package com.workout.generator.service.workoutgeneratorservice.data;

public class WorkoutDetails extends Workout {

    private int sets;
    private int reps;
    private int weightToUse;

    public WorkoutDetails(Workout workout, int weekOfCycle){
        setName(workout.getName());
        setOlympic(workout.isOlympic());
        setType(workout.getType());
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeightToUse(int weightToUse) {
        this.weightToUse = weightToUse;
    }


}
