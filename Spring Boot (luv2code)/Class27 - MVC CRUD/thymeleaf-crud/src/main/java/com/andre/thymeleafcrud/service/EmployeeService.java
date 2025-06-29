package com.andre.thymeleafcrud.service;

import com.andre.thymeleafcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(Integer id);
    List<Employee> findAll();
    void save(Employee employee);
    void deleteById(Integer id);
}
