package com.mycompany.methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Triangle t1, t2;
        t1 = new Triangle();
        t2 = new Triangle();

        System.out.print("\nEnter the first triangle measures (a, b, c): ");
        t1.a = read.nextDouble();
        t1.b = read.nextDouble();
        t1.c = read.nextDouble();
        t1.showArea(t1.area());

        System.out.print("Enter the second triangle measures (a, b, c): ");
        t2.a = read.nextDouble();
        t2.b = read.nextDouble();
        t2.c = read.nextDouble();
        t2.showArea(t2.area());

        read.close();
    }
}
