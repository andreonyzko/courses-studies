package com.andre.app.rest;

import com.andre.app.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestControllerTennis {

    private Coach myCoach;

    @Autowired
    public RestControllerTennis(@Qualifier("tennisCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout/tennis")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
