package com.andre.app.rest;

import com.andre.app.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestControllerBaseball {

    private Coach myCoach;

    @Autowired
    public RestControllerBaseball(@Qualifier("baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout/baseball")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
