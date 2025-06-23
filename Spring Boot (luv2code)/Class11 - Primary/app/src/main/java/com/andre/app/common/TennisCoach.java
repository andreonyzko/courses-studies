package com.andre.app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
