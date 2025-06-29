package com.andre.thymeleafcrud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;

    @Column(name="first_name")
    @Size(min=5, message = "Must have more than four characters")
    private String firstName;

    @Column(name="last_name")
    @Size(min=5, message = "Must have more than four characters")
    private String lastName;

    @Column(name="email")
    @Size(min = 1, message = "Enter an email")
    @Email(message = "Enter a valid email")
    private String email;

    public Employee(){}

    public Integer getId(){ return id; }
    public void setId(Integer id){ this.id = id; }
    public String getFirstName(){ return firstName; }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getLastName(){ return lastName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
}
