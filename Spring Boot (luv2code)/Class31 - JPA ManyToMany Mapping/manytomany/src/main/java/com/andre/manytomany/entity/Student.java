package com.andre.manytomany.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
            mappedBy = "students")
    private List<Course> courses;

    public Student(){}

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void getId() { this.id = id; }
    public void setId(Integer id) { this.id = id; }
    public String getFirstName() { return  this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return  this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return  this.email; }
    public void setEmail(String email) { this.email = email; }
    public List<Course> getCourses() { return  this.courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }

    public void addCourse(Course course){
        if(courses == null) courses = new ArrayList<>();
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s (%s)", id, firstName, lastName, email);
    }
}
