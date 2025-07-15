package com.andre.onetoone.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "instructor_detail")
public class InstructorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "youtube_channel")
    private String youtube;

    @Column(name = "hobby")
    private String hobby;

    @OneToOne(mappedBy = "instructorDetails", cascade = CascadeType.ALL)
    private Instructor instructor;

    public InstructorDetails(){}

    public InstructorDetails(String youtube, String hobby){
        this.youtube = youtube;
        this.hobby = hobby;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getYoutube() { return youtube; }
    public void setYoutube(String youtube) { this.youtube = youtube; }
    public String getHobby() { return hobby; }
    public void setHobby(String hobby) { this.hobby = hobby; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return String.format("%s | %s", youtube, hobby);
    }
}
