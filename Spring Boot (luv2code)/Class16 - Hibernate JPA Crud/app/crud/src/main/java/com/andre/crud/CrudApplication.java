package com.andre.crud;

import com.andre.crud.dao.StudentDAO;
import com.andre.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CrudApplication {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            // createStudent(studentDAO);
            createMultipleStudents(studentDAO);
            // readingStudent(studentDAO);
            // queryForStudents(studentDAO);
            // queryForStudentsByFirst(studentDAO);
            // updateStudent(studentDAO);
            // updateMultipleStudents(studentDAO);
            // deleteStudent(studentDAO);
            // deleteMultipleStudents(studentDAO);
            // deleteAllStudents(studentDAO);

            read.close();
        };
    }

    public void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating a new Student...");
        Student student = new Student("Andre", "Onyszko", "andre@gmail.com");

        System.out.println("Saving the student into database...");
        studentDAO.save(student);

        System.out.println(student);
    }

    public void createMultipleStudents(StudentDAO studentDAO) {
        Student s1 = new Student("Andre", "Onyszko", "andre@gmail.com");
        Student s2 = new Student("Lucas", "Shereda", "lucas@gmail.com");
        Student s3 = new Student("Kaua", "Silva", "kaua@gmail.com");
        Student s4 = new Student("Kaue", "Rodrigues", "kaue@gmail.com");

        studentDAO.save(s1);
        studentDAO.save(s2);
        studentDAO.save(s3);
        studentDAO.save(s4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public void readingStudent(StudentDAO studentDAO) {
        System.out.print("Student id: ");
        int id = read.nextInt();

        Student student = studentDAO.findById(id);
        if (student != null) System.out.println("\n" + student);
        else System.out.println("Student not found");
    }

    public void queryForStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for(Student student : students) System.out.println(student);
    }

    public void queryForStudentsByFirst(StudentDAO studentDAO) {
        System.out.print("First name char: ");
        char firstChar = read.next().charAt(0);
        List<Student> students = studentDAO.findByFirstChar(firstChar);

        System.out.println("Result: ");
        for(Student student : students) System.out.println(student);
    }

    public void updateStudent(StudentDAO studentDAO) {
        System.out.print("Enter student id: ");
        int id = read.nextInt();

        Student student = studentDAO.findById(id);
        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        System.out.print("Enter the new last name: ");
        String lastName = read.next();

        student.setLastName(lastName);
        studentDAO.update(student);

        student = studentDAO.findById(id);
        System.out.println("Student updated: " + student);
    }

    public void updateMultipleStudents(StudentDAO studentDAO) {
        System.out.print("Enter new students last name: ");
        String lastName = read.next();
        int rowsAffected = studentDAO.updateAll(lastName);
        System.out.println("Rows affected: " + rowsAffected);
        queryForStudents(studentDAO);
    }

    public void deleteStudent(StudentDAO studentDAO) {
        System.out.print("Enter student id: ");
        int id = read.nextInt();
        Student student = studentDAO.findById(id);
        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        studentDAO.deleteById(id);
        System.out.println("Student deleted");
    }

    public void deleteMultipleStudents(StudentDAO studentDAO) {
        System.out.print("Enter students first character name: ");
        char firstChar = read.next().charAt(0);
        List<Student> students = studentDAO.findByFirstChar(firstChar);
        if (students.isEmpty()) {
            System.out.println("Student not found");
            return;
        }

        int rowsDeleted = studentDAO.deleteByFirstChar(firstChar);
        System.out.println("Rows deleted: " + rowsDeleted);
    }

    public void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleted rows: " + studentDAO.deleteAll());
    }
}
