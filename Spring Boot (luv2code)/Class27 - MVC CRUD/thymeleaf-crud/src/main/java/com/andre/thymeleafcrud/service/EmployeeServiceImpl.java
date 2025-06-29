package com.andre.thymeleafcrud.service;

import com.andre.thymeleafcrud.entity.Employee;
import com.andre.thymeleafcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> employee = repository.findById(id);

        if(employee.isEmpty()) throw new RuntimeException("Employee not found");

        return employee.get();
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAllByOrderByFirstName();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
