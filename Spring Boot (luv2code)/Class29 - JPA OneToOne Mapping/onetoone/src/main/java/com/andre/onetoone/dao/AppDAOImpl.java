package com.andre.onetoone.dao;

import com.andre.onetoone.entity.Instructor;
import com.andre.onetoone.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO{

    private EntityManager em;

    @Autowired
    public AppDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    @Transactional
    public void updateIncrements(){
        em.createNativeQuery("ALTER TABLE instructor AUTO_INCREMENT = 1").executeUpdate();
        em.createNativeQuery("ALTER TABLE instructor_detail AUTO_INCREMENT = 1").executeUpdate();
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        em.persist(instructor);
    }

    @Override
    public Instructor findById(Integer id) {
        return em.find(Instructor.class, id);
    }

    @Override
    public InstructorDetails findInstructorDetailsById(Integer id) {
        return em.find(InstructorDetails.class, id);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Instructor instructor = findById(id);
        em.remove(instructor);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailsById(Integer id) {
        em.remove(findInstructorDetailsById(id));
    }
}
