package ex004;

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

        int evens=0;
        System.out.print("\nEven numbers: ");
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                evens++;
            }
        }
        System.out.println("\nAmount even numbers: "+ evens);

        read.close();
    }
}
