package com.andre.app.rest;

import com.andre.app.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Coach myCoach;

    @Autowired
    public RestController(@Qualifier("baseballCoach") Coach myCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @PostConstruct
    public void startupStuff(){
        System.out.println("In startupStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void shutdownStuff(){
        System.out.println("In shutdownStuff: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
