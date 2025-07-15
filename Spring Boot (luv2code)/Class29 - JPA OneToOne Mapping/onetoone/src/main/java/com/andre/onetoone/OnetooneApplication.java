package com.andre.onetoone;

import com.andre.onetoone.dao.AppDAO;
import com.andre.onetoone.entity.Instructor;
import com.andre.onetoone.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class OnetooneApplication {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {SpringApplication.run(OnetooneApplication.class, args);}

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO){
        return runner -> {
            appDAO.updateIncrements();
            while(true){
                int action = menu();

                if(action == 0) break;
                else if(action == 1) create(appDAO);
                else if(action == 2) findById(appDAO, colletId());
                else if(action == 3) findDetailsById(appDAO, colletId());
                else if(action == 4) deleteById(appDAO, colletId());
                else if(action == 5) deleteDetailsById(appDAO, colletId());
                else System.out.println("Invalid action");
            }
        };
    }

    public int menu(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1- Create instructor and details");
        System.out.println("2- Find instructor by id");
        System.out.println("3- Find details by id");
        System.out.println("4- Delete an instructor by id");
        System.out.println("5- Delete detail by id");
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

    public void create(AppDAO appDAO){
        System.out.println("Enter first name, last name, email, youtube link and a hobby");
        Instructor instructor = new Instructor(read.next(), read.next(), read.next());
        InstructorDetails details = new InstructorDetails(read.next(), read.next());
        instructor.setInstructorDetails(details);

        appDAO.save(instructor);
        System.out.println("Instructor created!");
    }

    public void findById(AppDAO appDAO, Integer id){
        Instructor instructor = appDAO.findById(id);
        System.out.println(instructor);
        System.out.println("Related details: " + instructor.getInstructorDetails());
    }

    public void findDetailsById(AppDAO appDAO, Integer id){
        InstructorDetails details = appDAO.findInstructorDetailsById(id);
        System.out.println(details);
        System.out.println("Related Instructor: " + details.getInstructor());
    }


    public void deleteById(AppDAO appDAO, Integer id){
        appDAO.deleteById(id);
        System.out.println("Instructor deleted!");
    }

    public void deleteDetailsById(AppDAO appDAO, Integer id){
        appDAO.deleteInstructorDetailsById(id);
        System.out.println("Instructor Details deleted!");
    }

}
