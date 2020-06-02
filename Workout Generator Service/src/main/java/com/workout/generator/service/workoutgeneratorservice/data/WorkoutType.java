package com.workout.generator.service.workoutgeneratorservice.data;

public enum WorkoutType {
    LEG("LEG"),
    BICEPS("BICEPS"),
    BACK("BACK"),
    SHOULDER("SHOULDER"),
    TRICEPS("TRICEPS"),
    CHEST("CHEST"),
    CORE("CORE"),
    CARDIO("CARDIO");

    private String type;

    WorkoutType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return type;
    }
}
