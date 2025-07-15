package com.andre.manytomany.dao;

import com.andre.manytomany.entity.Course;
import com.andre.manytomany.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


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
        // Busca o curso com reviews (JOIN FETCH apenas 1 bag)
        Course course = em.createQuery(
                        "SELECT c FROM Course c LEFT JOIN FETCH c.reviews WHERE c.id = :id", Course.class)
                .setParameter("id", id)
                .getSingleResult();

        // Inicializa os students com uma segunda query
        course.setStudents(
                em.createQuery(
                                "SELECT s FROM Student s JOIN s.courses c WHERE c.id = :id", Student.class)
                        .setParameter("id", id)
                        .getResultList()
        );
        return course;
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
