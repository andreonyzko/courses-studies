package com.andre.crud.dao;

import com.andre.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager em;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) { em = entityManager; }

    @Override
    public List<Employee> findAll(){ return em.createQuery("FROM Employee", Employee.class).getResultList(); }

    @Override
    public Employee findById(Integer id){ return em.find(Employee.class, id); }

    @Override
    public Employee save(Employee employee){ return em.merge(employee); }

    @Override
    public void deleteById(Integer id){ em.remove(em.find(Employee.class, id)); }
}
