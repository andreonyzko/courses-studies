package com.mycompany.forloop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("\nEnter numbers amount to sum: ");
        int n = read.nextInt();

        int sum= 0;
        for(int i=0; i<n; i++){
            System.out.printf("Number %d: ", i+1);
            sum += read.nextInt();
        }

        System.out.printf("\nResult= %d\n", sum);
        
        for(int i=10; i>=0; i--){
            System.out.printf("\ni value: %d", i);
        }

        read.close();
    }
}
