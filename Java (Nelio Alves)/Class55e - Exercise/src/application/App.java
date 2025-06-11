package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Set<User> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int amount= read.nextInt();
        for(int i = 0; i<amount; i++) students.add(new User(read.nextInt()));

        System.out.print("How many students for course B? ");
        amount= read.nextInt();
        for(int i = 0; i<amount; i++) students.add(new User(read.nextInt()));

        System.out.print("How many students for course C? ");
        amount= read.nextInt();
        for(int i = 0; i<amount; i++) students.add(new User(read.nextInt()));

        System.out.println("Total students: " + students.size());

        read.close();
    }
}
