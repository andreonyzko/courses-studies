package com.mycompany.ternary;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter some price: ");
        double price = sc.nextDouble();
        
        double disccount = (price < 20.00) ? (price*0.1) : (price*0.05); // ternary conditional
        
        System.out.println("Disccount: $" + disccount);

        sc.close();
    }
}
