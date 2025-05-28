package com.mycompany.exercises;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double radius, pi;
        pi = 3.14159;
        
        System.out.print("Enter the circle radius: ");
        radius = sc.nextDouble();
        
        System.out.printf("Circle's Area is " + Math.pow(radius, 2)*pi);
        
        sc.close();
    }
    
}
