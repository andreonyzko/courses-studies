package com.mycompany.exercises;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start, end;
        System.out.print("Enter start hour: ");
        start = sc.nextInt();
        
        System.out.print("Enter end hour: ");
        end = sc.nextInt();
        
        if(start < end){
            System.out.printf("The game lasted %d hours", end-start);
        }
        else if (start == end){
            System.out.printf("The game lasted 24 hours");
        }
        else{
            System.out.printf("The game lasted %d hours", (24-start+end));
        }
        
        sc.close();
    }
    
}
