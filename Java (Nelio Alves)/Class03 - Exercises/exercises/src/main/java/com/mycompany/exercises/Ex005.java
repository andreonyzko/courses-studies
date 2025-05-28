package com.mycompany.exercises;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        int amount2;
        double unityValue, unityValue2;
        
        System.out.print("Enter first product id: ");
        sc.nextInt();
        System.out.print("Enter first product amount: ");
        amount = sc.nextInt();
        System.out.print("Enter first product unity value: ");
        unityValue = sc.nextDouble();
        
        System.out.print("Enter second product id: ");
        sc.nextInt();
        System.out.print("Enter second product amount: ");
        amount2 = sc.nextInt();
        System.out.print("Enter second product unity value: ");
        unityValue2 = sc.nextDouble();
        
        System.out.println("Value to pay: U$" + (amount*unityValue + amount2*unityValue2));
        sc.close();
    }
    
}
