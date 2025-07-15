package com.andre.onetoone.dao;

import com.andre.onetoone.entity.Course;
import com.andre.onetoone.entity.Instructor;
import com.andre.onetoone.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class InstructorDAOImpl implements InterfaceDAO<Instructor> {

    private EntityManager em;

    @Autowired
    public InstructorDAOImpl(EntityManager em){
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

    public InstructorDetails findInstructorDetailsById(Integer id) {
        return em.find(InstructorDetails.class, id);
    }

    public Instructor getInstructorWithCoursesById(Integer id){
        return em.createQuery(
                        "SELECT i FROM Instructor i JOIN FETCH i.courses WHERE i.id = :data", Instructor.class)
                .setParameter("data", id)
                .getSingleResult();

    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Instructor instructor = findById(id);

        List<Course> courses = instructor.getCourses();
        for(Course course: courses) course.setInstructor(null);

        em.remove(instructor);
    }

    @Transactional
    public void deleteInstructorDetailsById(Integer id) {
        em.remove(findInstructorDetailsById(id));
    }

    @Override
    @Transactional
    public void update(Instructor instructor) {
        em.merge(instructor);
    }
}
