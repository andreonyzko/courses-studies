package com.andre.app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
