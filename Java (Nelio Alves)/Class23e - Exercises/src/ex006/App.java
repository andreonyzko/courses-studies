package ex006;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nHow many numbers you will enter? ");
        int numbers[] = new int[read.nextInt()];
        int numbers2[] = new int[numbers.length];

        System.out.println("\nFIRST ARRAY: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print((i+1) + "st number: ");
            numbers[i] = read.nextInt();
        }

        System.out.println("\nSECOND ARRAY: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print((i+1) + "st number: ");
            numbers2[i] = read.nextInt();
        }

        System.out.println("\nRESULT ARRAY: ");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] + numbers2[i]);
        }

        read.close();
    }
}
