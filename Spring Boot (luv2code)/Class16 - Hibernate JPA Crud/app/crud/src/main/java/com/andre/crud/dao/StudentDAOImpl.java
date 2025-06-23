package com.andre.crud.dao;

import com.andre.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    // declarando campo para o entityManager
    private EntityManager em;

    // injetando o entityManager com construtor
    @Autowired
    public StudentDAOImpl(EntityManager em) {
        this.em = em;
    }

    // implementando o método save
    @Override
    @Transactional
    public void save(Student student) { em.persist(student); }

    @Override
    public Student findById(int id) { return em.find(Student.class, id); }

    @Override
    public List<Student> findAll() {
        return em.createQuery("from Student ORDER BY firstName DESC", Student.class).getResultList();
    }

    @Override
    public List<Student> findByFirstChar(char firstChar) {
        TypedQuery<Student> query = em.createQuery("FROM Student WHERE firstName LIKE :firstChar", Student.class);
        query.setParameter("firstChar", firstChar + "%");
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) { em.merge(student); }

    @Override
    @Transactional
    public int updateAll(String newLastName) {
        Query query = em.createQuery("UPDATE Student SET lastName = :lastName");
        query.setParameter("lastName", newLastName);
        return query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        em.remove(em.find(Student.class, id));
    }

    @Override
    @Transactional
    public int deleteByFirstChar(char FirstChar) {
        Query query = em.createQuery("DELETE FROM Student WHERE firstName LIKE :firstChar");
        query.setParameter("firstChar", FirstChar + "%");
        return query.executeUpdate();
    }

    @Override
    @Transactional
    public int deleteAll() {
        return em.createQuery("DELETE FROM Student").executeUpdate();
    }
}
