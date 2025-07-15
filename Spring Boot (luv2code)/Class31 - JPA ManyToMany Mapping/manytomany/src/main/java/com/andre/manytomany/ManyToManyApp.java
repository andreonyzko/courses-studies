package com.andre.manytomany;

import com.andre.manytomany.dao.CourseDAOImpl;
import com.andre.manytomany.dao.InstructorDAOImpl;
import com.andre.manytomany.dao.StudentDAOImpl;
import com.andre.manytomany.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Scanner;

@SpringBootApplication
public class ManyToManyApp {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {SpringApplication.run(ManyToManyApp.class, args);}

    @Bean
    public CommandLineRunner commandLineRunner(InstructorDAOImpl instructorDAO, CourseDAOImpl courseDAO, StudentDAOImpl studentDAO){
        return runner -> {
            instructorDAO.updateIncrements();
            courseDAO.updateIncrements();
            while(true){
                int action = menu();

                if(action == 0) break;
                else if(action == 1) createInstructor(instructorDAO);
                else if(action == 2) updateInstructor(instructorDAO, colletId());
                else if(action == 3) findInstructorById(instructorDAO, colletId());
                else if(action == 4) findDetailsById(instructorDAO, colletId());
                else if(action == 5) deleteInstructorById(instructorDAO, colletId());
                else if(action == 6) deleteDetailsById(instructorDAO, colletId());
                else if(action == 7) createCourse(instructorDAO, courseDAO);
                else if(action == 8) updateCourse(courseDAO, colletId());
                else if(action == 9) findCourseById(courseDAO, colletId());
                else if(action == 10) deleteCourseById(courseDAO, colletId());
                else if(action == 11) makeReview(courseDAO, colletId());
                else if(action == 12) viewReviews(courseDAO, colletId());
                else if(action == 13) createStudent(studentDAO);
                else if(action == 14) addStudentToCourse(studentDAO, courseDAO, colletId(), colletId());
                else System.out.println("Invalid action");
            }
        };
    }

    public int menu(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1- Create instructor and details");
        System.out.println("2- Update instructor by id");
        System.out.println("3- View instructor by id");
        System.out.println("4- View instructor details by id");
        System.out.println("5- Delete an instructor by id");
        System.out.println("6- Delete instructor detail by id");
        System.out.println();
        System.out.println("7- Create course");
        System.out.println("8- Update course by id");
        System.out.println("9- View course by id");
        System.out.println("10- Delete course by id");
        System.out.println();
        System.out.println("11- Make a review of a course");
        System.out.println("12- View reviews");
        System.out.println();
        System.out.println("13- Create Student");
        System.out.println("14- Add student to course");
        System.out.println("0 - Exit program");
        System.out.print("Action: ");
        int action = read.nextInt();
        read.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        return action;
    }

    public int colletId(){
        System.out.print("Enter ID: ");
        int id = read.nextInt();
        read.nextLine();
        return id;
    }

    public void createInstructor(InstructorDAOImpl instructorDAO){
        System.out.println("Enter first name, last name, email, youtube link and a hobby");
        Instructor instructor = new Instructor(read.next(), read.next(), read.next());
        InstructorDetails details = new InstructorDetails(read.next(), read.next());
        read.nextLine();
        instructor.setInstructorDetails(details);

        instructorDAO.save(instructor);
        System.out.println("Instructor created!");
    }

    public void createCourse(InstructorDAOImpl instructorDAO, CourseDAOImpl courseDAO){
        System.out.print("Enter title and instructor id: ");
        Course course = new Course(read.nextLine(), instructorDAO.findById(read.nextInt()));
        read.nextLine();
        courseDAO.save(course);
        System.out.println("Course created!");
    }

    private void updateInstructor(InstructorDAOImpl instructorDAO, Integer id) {
        Instructor instructor = instructorDAO.findById(id);
        System.out.println("Enter new first name, last name, email:");
        instructor.setFirstName(read.next());
        instructor.setLastName(read.next());
        instructor.setEmail(read.next());
        read.nextLine();

        instructorDAO.update(instructor);
        System.out.println("Updated instructor!");
    }

    private void updateCourse(CourseDAOImpl courseDAO, Integer id) {
        Course course = courseDAO.findById(id);
        System.out.print("Enter new title: ");
        course.setTitle(read.next());
        read.nextLine();
        courseDAO.update(course);
        System.out.println("Updated course!");
    }

    public void findInstructorById(InstructorDAOImpl instructorDAO, Integer id){
        Instructor instructor = instructorDAO.getInstructorWithCoursesById(id);
        System.out.println(instructor + " (" + instructor.getInstructorDetails() + ")");
        System.out.println("Courses: ");
        for(Course course : instructor.getCourses()) System.out.println("\t- " + course.getTitle());
    }

    public void findDetailsById(InstructorDAOImpl instructorDAO, Integer id){
        InstructorDetails details = instructorDAO.findInstructorDetailsById(id);
        System.out.println(details);
        System.out.println("Related Instructor: " + details.getInstructor());
    }

    public void findCourseById(CourseDAOImpl courseDAO, Integer id){
        System.out.println(courseDAO.findById(id));
    }

    public void deleteInstructorById(InstructorDAOImpl instructorDAO, Integer id){
        instructorDAO.deleteById(id);
        System.out.println("Instructor deleted!");
    }

    public void deleteDetailsById(InstructorDAOImpl instructorDAO, Integer id){
        instructorDAO.deleteInstructorDetailsById(id);
        System.out.println("Instructor Details deleted!");
    }

    public void deleteCourseById(CourseDAOImpl courseDAO, Integer id){
        courseDAO.deleteById(id);
        System.out.println("Course deleted!");
    }

    public void makeReview(CourseDAOImpl courseDAO, Integer id){
        Course course = courseDAO.findById(id);
        System.out.print("Enter the review: ");
        course.addReview(new Review(read.nextLine()));
        courseDAO.update(course);
        System.out.println("Review sent!");
    }

    public void viewReviews(CourseDAOImpl courseDAO, Integer id){
        Course course = courseDAO.getCourseWithReviewsById(id);
        System.out.println(course);
        for(Review review : course.getReviews()) System.out.println("\t- " + review);
    }

    public void createStudent(StudentDAOImpl studentDAO){
        System.out.print("Enter first name, last name and email: ");
        Student student = new Student(read.next(), read.next(), read.next());
        read.nextLine();

        studentDAO.save(student);
        System.out.println("Student created!");
    }

    public void addStudentToCourse(StudentDAOImpl studentDAO, CourseDAOImpl courseDAO, Integer studentId, Integer courseId){
        Course course= courseDAO.findById(courseId);
        Student student = studentDAO.findById(studentId);

        course.addStudent(student);
        System.out.println("Student added to course!");

        courseDAO.update(course);
    }
}
