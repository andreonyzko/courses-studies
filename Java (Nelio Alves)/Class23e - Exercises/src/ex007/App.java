package ex007;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nHow many numbers you will enter? ");
        double numbers[] = new double[read.nextInt()];

        double average=0;
        for(int i=0; i<numbers.length; i++){
            System.out.print((i+1) + "st number: ");
            numbers[i] = read.nextDouble();
            average += numbers[i];
        }

        average /= numbers.length;
        System.out.printf("\nArray average: %.2f\n", average);
        System.out.println("Under average elements: ");
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < average) System.out.println(numbers[i]);
        }

        read.close();
    }
}
