package com.mycompany.datainput;

import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example 1
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println("Number entered: " + number);
        
        // Example 2
        double decimalNumber;
        System.out.print("Enter a decimal number: ");
        decimalNumber = sc.nextDouble();
        System.out.println("Decimal number entered: " + decimalNumber);
        
        // Example 3
        String word;
        System.out.print("Enter a word: ");
        word = sc.next();
        System.out.println("Word entered: " + word);
        
        // Example 4
        char letter;
        System.out.print("Enter a gender (Male or Female): ");
        letter = sc.next().charAt(0);
        System.out.println("Letter gender entered: " + letter);
        
        // Example 5
        System.out.print("Enter in sequence a word, number and decimal number: ");
        word = sc.next();
        number = sc.nextInt();
        decimalNumber = sc.nextDouble();
        System.out.println("Word entered: " + word);
        System.out.println("Number entered: " + number);
        System.out.println("Decimal number entered: " + decimalNumber);
        
        // Example 6
        String s1, s2, s3;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter three sentences: ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Sentences entered: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close();
    }
}
