package com.andre.crud.rest;

import com.andre.crud.entity.Employee;
import com.andre.crud.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    private ObjectMapper objectMapper;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService, ObjectMapper objectMapper){
        this.employeeService = employeeService;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findEmployee(@PathVariable Integer employeeId){
        Employee employee = employeeService.findById(employeeId);
        if(employee == null) throw new RuntimeException("Employee not found: " + employeeId);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(null);
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId){
        if(employeeService.findById(employeeId) == null) throw new RuntimeException("Employee id not found: " + employeeId);

        employeeService.deleteById(employeeId);
        return "Employee deleted: " + employeeId;
    }

    @PatchMapping("/employees/{employeeId}")
    public Employee updateEmployee(@RequestBody Map<String, Object> patchPayLoad, @PathVariable Integer employeeId){
       Employee tempEmployee = employeeService.findById(employeeId);

       if(tempEmployee == null) throw new RuntimeException("Employee not found");
       if(patchPayLoad.containsKey("id")) throw new RuntimeException("Cannot allow update id");

       Employee employee = apply(patchPayLoad, tempEmployee);
       return employeeService.save(employee);
    }

    public Employee apply(Map<String, Object> patchToLoad, Employee employee){
        ObjectNode employeeNode = objectMapper.convertValue(employee, ObjectNode.class);
        ObjectNode patchNode = objectMapper.convertValue(patchToLoad, ObjectNode.class);

        employeeNode.setAll(patchNode);

        return objectMapper.convertValue(employeeNode, Employee.class);
    }
}
