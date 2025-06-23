package com.andre.crud.dao;

import com.andre.crud.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByFirstChar(char character);
    void update(Student student);
    int updateAll(String newLastName);
    void deleteById(int id);
    int deleteByFirstChar(char FirstChar);
    int deleteAll();
}
