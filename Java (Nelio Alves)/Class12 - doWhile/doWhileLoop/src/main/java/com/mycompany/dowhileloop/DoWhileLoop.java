package com.mycompany.dowhileloop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char resp;

        do{
            System.out.print("\nCelsius value: ");
            double c = read.nextDouble();
            double f = 9*c/5+32;
            System.out.printf("Fahrenheit equivalence: %.1f\n", f);
            System.out.print("Continue? (y/n) ");
            resp = read.next().charAt(0);
        }while(resp == 'y');

        read.close();
    }
}
