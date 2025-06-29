package com.andre.thymeleaf.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm(){ return "helloworld-form"; }

    @PostMapping("/processForm")
    public String processForm(@RequestParam("studentName") String studentName, Model model){
        studentName = studentName.toUpperCase();
        model.addAttribute("message", "HELLO WORLD, " + studentName + "!");
        return "helloworld";
    }

//    @RequestMapping("/showForm")
//    public String showForm(){
//        return "helloworld-form";
//    }
//
//    @RequestMapping("/processForm")
//    public String processForm(){
//        return "helloworld";
//    }
//
//    @RequestMapping("/processForm")
//    public String processForm(HttpServletRequest request, Model model){
//        String name = request.getParameter("studentName").toUpperCase();
//        String message= "HELLO WORLD, " +  name + "!";
//        model.addAttribute("message", message);
//
//        return "helloworld";
//    }
//
//    @RequestMapping("/processForm")
//    public String processForm(@RequestParam("studentName") String studentName, Model model){
//        String name = studentName.toUpperCase();
//        String message= "HELLO WORLD, " +  name + "!";
//        model.addAttribute("message", message);
//
//        return "helloworld";
//    }
}
