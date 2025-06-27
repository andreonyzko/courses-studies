package com.andre.crud.service;

import com.andre.crud.dao.EmployeeRepository;
import com.andre.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll(){ return employeeRepository.findAll(); }

    @Override
    public Employee findById(Integer id){
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isEmpty()) throw new RuntimeException("Employee id not found: " + id);

        return employee.get();
    }

    @Override
    public Employee save(Employee employee) { return employeeRepository.save(employee); }

    @Override
    public void deleteById(Integer id) { employeeRepository.deleteById(id); }
}
