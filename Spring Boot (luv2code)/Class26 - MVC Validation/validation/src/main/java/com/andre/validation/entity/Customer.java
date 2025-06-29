package com.andre.validation.entity;

import com.andre.validation.validation.CourseCode;
import jakarta.validation.constraints.*;
import org.springframework.cglib.core.Local;

import java.time.Instant;
import java.time.LocalDate;


public class Customer {

    @NotNull(message = "required")
    @Size(min = 5, message = "Must be bigger than five")
    private String firstName, lastName;

    @NotNull(message = "required")
    @Min(value = 0, message = "Must be greater than 0")
    @Max(value = 10, message = "Must be less than 10")
    private Integer creditScore;

    @Pattern(regexp = "\\d{5}-\\d{3}", message = "Use the path XXXXX-XXX")
    private String CEP;

    @CourseCode(value="ONY", message = "Must start with \"ONY\"")
    private String course;

    public Customer() {}

    public String getFirstName() { return  firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return  lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Integer getCreditScore() { return creditScore; }
    public void setCreditScore(Integer birthYear) { this.creditScore = birthYear; }
    public String getCEP() { return CEP; }
    public void setCEP(String CEP) { this.CEP = CEP; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
