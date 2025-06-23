package com.andre.app.rest;

import com.andre.app.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Coach myCoach, anotherCoach;

    @Autowired
    public RestController(@Qualifier("baseballCoach") Coach myCoach,  @Qualifier("baseballCoach") Coach anotherCoach)
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "myCoach == anotherCoach? " + (myCoach == anotherCoach);
    }
}
