package ex003.application;

import java.util.Scanner;

import ex003.entities.Person;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        Person people[] = new Person[read.nextInt()];
        read.nextLine();

        double heightAverage=0, u16=0;
        for(int i=0; i<people.length; i++){
            System.out.println();
            System.out.println((i+1) + "ST PERSON:");

            System.out.print("Name: ");
            String name = read.nextLine();

            System.out.print("Age: ");
            int age = read.nextInt();

            System.out.print("Height: ");
            double height = read.nextDouble();
            read.nextLine();

            if(age < 16) u16++;
            heightAverage += height;
            people[i] = new Person(name, age, height);
        }

        
        System.out.printf("\nHeight average: %.2f", heightAverage/people.length);
        System.out.printf("\nPeople under 16 years old: %.1f%%\n", u16/people.length*100);
        for(int i=0; i < people.length; i++){
            if(people[i].getAge() < 16) System.out.println(people[i].getName());   
        }

        read.close();
    }
}
