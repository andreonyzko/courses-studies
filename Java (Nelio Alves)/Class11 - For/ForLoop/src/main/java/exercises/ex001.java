package exercises;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter x value: ");
        int x = read.nextInt();

        System.out.printf("\nOdd Values between 0 and %d:\n", x);
        for(int i=0; i<x; i++){
            if(i%2 != 0) System.out.print(i + " ");
        }

        read.close();
    }
}
