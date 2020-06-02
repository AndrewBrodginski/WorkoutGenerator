package com.workout.generator.service.workoutgeneratorservice.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Workout")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private WorkoutType type;

    @Column(name = "olympic")
    private boolean olympic;

    public Workout() {
    }

    public Workout(String name, WorkoutType type, boolean olympic) {
        this.name = name;
        this.type = type;
        this.olympic = olympic;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

    public boolean isOlympic() {
        return olympic;
    }

    public void setOlympic(boolean olympic) {
        this.olympic = olympic;
    }

}
