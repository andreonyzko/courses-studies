package com.andre.manytomany.dao;

import com.andre.manytomany.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentDAOImpl implements InterfaceDAO<Student> {

    private EntityManager em;

    @Autowired
    public StudentDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    @Transactional
    public void updateIncrements() {
        em.createNativeQuery("ALTER TABLE student AUTO_INCREMENT = 1").executeUpdate();
    }

    @Override
    @Transactional
    public void save(Student student) {
        em.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return em.createQuery("SELECT s FROM Student s LEFT JOIN s.courses WHERE s.id = :data", Student.class).setParameter("data", id).getSingleResult();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        em.remove(findById(id));
    }

    @Override
    @Transactional
    public void update(Student student) {
        em.merge(student);
    }

    public Student getCourseWithReviewsById(Integer id){
        return em.createQuery("SELECT s FROM Student s JOIN FETCH s.courses WHERE s.id = :data", Student.class).setParameter("data", id).getSingleResult();
    }
}
