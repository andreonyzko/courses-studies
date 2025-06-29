package com.andre.thymeleafcrud.repository;

import com.andre.thymeleafcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    public List<Employee> findAllByOrderByFirstName();
}