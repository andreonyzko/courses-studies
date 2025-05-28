package com.mycompany.exercises;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, num2;
        System.out.print("Enter a first number: ");
        num = sc.nextInt();
        System.out.print("Enter another number: ");
        num2 = sc.nextInt();
        
        if(num % num2 == 0 || num2 % num == 0){
            System.out.println("Numbers are multiples");
        }
        else{
            System.out.println("Numbers aren't multiples");
        }
        
        sc.close();
    }
    
}
