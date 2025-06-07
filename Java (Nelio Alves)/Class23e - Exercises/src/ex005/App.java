package ex005;

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

        int pos = 0;
        double bigger = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > bigger){
                pos = i;
                bigger = numbers[i];
            }
        }

        System.out.println("\nBigger value: " + bigger);
        System.out.println("Bigger value position: " + pos);

        read.close();
    }
}
