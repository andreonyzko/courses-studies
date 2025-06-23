package com.andre.springboot.demo.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

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
}
