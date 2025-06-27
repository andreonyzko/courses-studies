package com.andre.restcrude.rest;


import com.andre.restcrude.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadDatas(){
        students = new ArrayList<>();

        students.add(new Student(1, "Andre", "andre@gmail.com", "409991234567", "123", "Rua das Flores", "Curitiba", "PR", "80000-000", "Brasil"));

        students.add(new Student(2, "Kaua", "kaua@gmail.com", "409993456127", "456", "Av. Brasil", "Londrina", "PR", "86000-000", "Brasil"));

        students.add(new Student(3, "Lucas", "lucas@gmail.com", "409991567234", "789", "Rua A", "Maringá", "PR", "87000-000", "Brasil"));

        students.add(new Student(4, "Kaue", "kaue@gmail.com", "409991567234", "321", "Rua B", "Ponta Grossa", "PR", "84000-000", "Brasil"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if(studentId < 1 || studentId > students.size()) throw new StudentNotFoundException("Student Not Founded");
        return students.get(studentId-1);
    }
}
