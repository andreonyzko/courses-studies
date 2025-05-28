package com.mycompany.stringfunctions;

import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        System.out.print("\nEnter a first sentence: ");
        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();

        System.out.printf("Original sentence: '%s'\n", sentence);

        // Get string size
        System.out.printf("String Length: %d\n", sentence.length());
        
        // Cut string by a delimitador
        String[] splitedSentence = sentence.split(" ");
        for(String obj : splitedSentence) System.out.printf("[%s] ", obj);

        // Remove spaces around the sentece
        System.out.printf("\nSentece without spaces in around: '%s'\n", sentence.trim());

        // Get caracther from specific position
        System.out.printf("3th Letter: %c\n", sentence.charAt(2));

        // Get first and last position of a letter
        System.out.printf("Position of first A char: %d\n", sentence.indexOf('A'));
        System.out.printf("Position of last A char: %d\n", sentence.lastIndexOf('A'));

        // Setence to lower and upper case
        System.out.printf("Sentence to lower case: %s\n", sentence.toLowerCase());
        System.out.printf("Sentence to upper case: %s\n", sentence.toUpperCase());

        // Get substrings
        System.out.printf("String of intervel 3-end: %s\n", sentence.substring(3));
        System.out.printf("String of intervel 0-3: %s\n", sentence.substring(0,3));

        System.out.print("Enter two chars, first to be replaced, and second the new: ");
        char charTo = read.next().charAt(0);
        char charBy = read.next().charAt(0);
        System.out.println(charTo + " - " + charBy);
        String replacedSentece = new String(sentence);
        System.out.printf("Sentece replaced: '%s'\n", replacedSentece.replace(charTo, charBy));

        System.out.print("Enter a second sentence: ");
        read.nextLine();
        String sentence2 = read.nextLine();

        // Concatene
        System.out.printf("Strings concatened: '%s'\n", sentence.concat(sentence2));

        // Compare
        System.out.println("Strings are equals?: " + sentence.equals(sentence2));
        System.out.println("Strings are equals (no case sensitive)?: " + sentence.equalsIgnoreCase(sentence2));
        read.close();
    }
}
