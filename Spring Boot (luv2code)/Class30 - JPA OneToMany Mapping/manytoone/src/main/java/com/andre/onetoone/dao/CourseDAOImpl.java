package com.andre.onetoone.dao;

import com.andre.onetoone.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class CourseDAOImpl implements InterfaceDAO<Course> {

    private EntityManager em;

    @Autowired
    public CourseDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    @Transactional
    public void updateIncrements() {
        em.createNativeQuery("ALTER TABLE course AUTO_INCREMENT = 1").executeUpdate();
    }

    @Override
    @Transactional
    public void save(Course course) {
        em.persist(course);
    }

    @Override
    public Course findById(Integer id) {
        return em.find(Course.class, id);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        em.remove(findById(id));
    }

    @Override
    @Transactional
    public void update(Course course) {
        em.merge(course);
    }

    public Course getCourseWithReviewsById(Integer id){
        return em.createQuery("SELECT c FROM Course c JOIN FETCH c.reviews WHERE c.id = :data", Course.class).setParameter("data", id).getSingleResult();
    }
}
