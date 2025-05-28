package com.mycompany.exercises;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if(number < 0){
            System.out.println("It's a negative number!");
        }
        else{
            System.out.println("It's a positive number!");
        }
        
        sc.close();
    }
    
}
