package application;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Triangle t1, t2;
        t1 = new Triangle();
        t2 = new Triangle();

        System.out.print("\nEnter the first triangle measures (a, b, c): ");
        t1.a = read.nextDouble();
        t1.b = read.nextDouble();
        t1.c = read.nextDouble();

        System.out.print("Enter the second triangle measures (a, b, c): ");
        t2.a = read.nextDouble();
        t2.b = read.nextDouble();
        t2.c = read.nextDouble();

        double t1Area = t1.a*t1.b/2; 
        double t2Area = t2.a*t2.b/2;
        
        System.out.println("\nFirst Triangule Area: " + t1Area);
        System.out.println("Second Triangule Area: " + t2Area);

        read.close();
    }
}
