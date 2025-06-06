package application;
import java.util.Scanner;

import util.Calculator;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter the radius: ");
        double radius = read.nextDouble();

        System.out.printf("Circumference = %.2f \n", Calculator.circumference(radius));
        System.out.printf("Volume = %.2f \n", Calculator.volume(radius));
        System.out.printf("PI Value = %.4f", Calculator.PI);

        read.close();
    }
}
