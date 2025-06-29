package com.andre.demo.entity;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String devLanguage;
    private List<String> system;

    public Student() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getDevLanguage() { return devLanguage; }

    public void setDevLanguage(String devLanguage) { this.devLanguage = devLanguage; }

    public List<String> getSystem() { return system; }

    public void setSystem(List<String> system) { this.system = system; }
}
