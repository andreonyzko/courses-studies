package com.andre.springboot.demo.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${enterprise.name}")
    private String enterpriseName;

    @Value("${enterprise.founder}")
    private String enterpriseFounder;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Workout!";
    }

    @GetMapping("/fortune")
    public String fortune(){
        return "Fortune!";
    }

    @GetMapping("/enterprise")
    public String enterprise(){
        return enterpriseName + " was created by " +  enterpriseFounder;
    }
}
