package com.mycompany.conditional;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour, period;
        while(true){
            System.out.print("What hours is? (Example 11 AM) ");
            hour = sc.nextInt();
            period = sc.next().charAt(0);

            if(period == 'A' && hour <= 12){
                System.out.println("So, good morning!");
            }
            else if(period == 'P' && hour < 7){
                System.out.println("So, good afternoon!");
            }
            else if(period == 'P' && hour <= 12 && hour >= 7){
                System.out.println("So, goodnight!");
            }
            else{
                System.out.println("You entered an invalid hour");
            }
        }
    }
}
