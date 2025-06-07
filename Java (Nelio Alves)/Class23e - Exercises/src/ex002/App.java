package ex002;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nHow many numbers you will enter? ");
        int numbers[] = new int[read.nextInt()];

        for(int i=0; i<numbers.length; i++){
            System.out.print((i+1) + "st number: ");
            numbers[i] = read.nextInt();
        }

        double sum=0;

        System.out.print("\nValues: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        System.out.printf("\nSum: %.2f", sum);
        System.out.printf("\nAverage: %.2f", sum/numbers.length);

        read.close();
    }
}
