package com.andre.onetoone.dao;

import com.andre.onetoone.entity.Instructor;
import com.andre.onetoone.entity.InstructorDetails;

import java.util.List;

public interface AppDAO {
    public void updateIncrements();
    void save(Instructor instructor);
    Instructor findById(Integer id);
    InstructorDetails findInstructorDetailsById(Integer id);
    void deleteById(Integer id);
    void deleteInstructorDetailsById(Integer id);
}
