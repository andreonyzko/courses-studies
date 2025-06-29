package com.andre.demo.rest;

import com.andre.demo.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/newStudent")
    public String studentForm(Model model){
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @PostMapping("/student")
    public String studentConfirmation(@ModelAttribute("student") Student student){
        return "studentConfirmation";
    }
}
