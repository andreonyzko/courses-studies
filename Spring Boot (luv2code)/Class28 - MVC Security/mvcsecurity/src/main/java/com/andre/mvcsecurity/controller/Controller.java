package com.andre.mvcsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/leaders")
    public String leader(){
        return "leaders";
    }

    @GetMapping("/systems")
    public String systems(){
        return "systems";
    }

    @GetMapping("/unauthorizated")
    public String unauthorizated(){
        return "unauthorizated";
    }
}
