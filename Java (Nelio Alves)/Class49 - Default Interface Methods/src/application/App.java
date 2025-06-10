package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Enter loan details:");
        System.out.print("Amount: $");
        double amount = read.nextDouble();
        System.out.print("Months: ");
        int months = read.nextInt();

        InterestService is = new BrazilInterestService(2.0);

        System.out.println("\n=-=-=-=-=- BRAZIL -=-=--=-=-=");
        System.out.println("Payment after " + months + " months:");
        System.out.printf("$%.2f\n", is.payment(amount, months));

        is = new USAInterestService(1.0);

        System.out.println("\n=-=-=-=-=- USA -=-=--=-=-=");
        System.out.println("Payment after " + months + " months:");
        System.out.printf("$%.2f", is.payment(amount, months));

        read.close();
    }
}
