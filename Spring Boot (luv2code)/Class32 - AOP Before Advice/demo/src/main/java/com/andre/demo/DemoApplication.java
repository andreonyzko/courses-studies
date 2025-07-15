package com.andre.demo;

import com.andre.demo.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO){
        return commandLine -> {
            demoTheBeforeAdvice(accountDAO);
        };
    }

    public void demoTheBeforeAdvice(AccountDAO accountDAO){
        accountDAO.addAccount();
        System.out.println("Callig again...");
        accountDAO.addAccount();
    }

}
