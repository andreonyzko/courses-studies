package ex008;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nHow many numbers you will enter? ");
        int numbers[] = new int[read.nextInt()];

        double average=0;
        int evens=0;
        for(int i=0; i<numbers.length; i++){
            System.out.print((i+1) + "st number: ");
            numbers[i] = read.nextInt();

            if(numbers[i] % 2 == 0){
                 average += numbers[i];
                 evens++;
            };
        }
        
        average /= evens;

        if(evens > 0) System.out.printf("Evens average: %.2f", average);
        else System.out.println("No evens numbers");

        read.close();
    }
}
