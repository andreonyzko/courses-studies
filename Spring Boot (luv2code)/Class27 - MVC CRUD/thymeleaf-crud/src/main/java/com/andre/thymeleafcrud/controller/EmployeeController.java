package com.andre.thymeleafcrud.controller;

import com.andre.thymeleafcrud.entity.Employee;
import com.andre.thymeleafcrud.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        List<Employee> employees = service.findAll();
        model.addAttribute("employees", employees);
        return "dashboard";
    }

    @GetMapping("/new")
    public String newEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "form";
    }

    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return "form";

        service.save(employee);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String updateEmployee(@RequestParam("id") Integer employeeId, Model model){
        Employee employee = service.findById(employeeId);
        model.addAttribute("employee", employee);
        return "form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") Integer employeeId){
        service.deleteById(employeeId);

        return "redirect:/";
    }
}
