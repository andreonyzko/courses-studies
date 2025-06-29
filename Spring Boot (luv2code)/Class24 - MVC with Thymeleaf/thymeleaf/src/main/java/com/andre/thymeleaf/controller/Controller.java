package com.andre.thymeleaf.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("theDate", LocalDateTime.now());

        return "helloworld";
    }
}
