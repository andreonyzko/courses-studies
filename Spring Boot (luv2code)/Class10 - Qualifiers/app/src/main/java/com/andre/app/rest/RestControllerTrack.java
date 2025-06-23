package com.andre.app.rest;

import com.andre.app.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestControllerTrack {

    private Coach myCoach;

    @Autowired
    public RestControllerTrack(@Qualifier("trackCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout/track")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
