package com.andre.app.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Swim 1000 meter as a warm up";
    }
}
