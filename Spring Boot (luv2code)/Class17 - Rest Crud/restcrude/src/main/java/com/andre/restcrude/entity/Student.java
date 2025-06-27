package com.andre.restcrude.entity;

public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private Address address;

    public Student(){}
    public Student(int id, String name, String email, String phone, String number, String street, String city, String state, String zip, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = new Address(number, street, city, state, zip, country);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
