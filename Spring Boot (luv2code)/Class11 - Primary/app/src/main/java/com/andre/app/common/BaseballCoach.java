package com.andre.app.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
