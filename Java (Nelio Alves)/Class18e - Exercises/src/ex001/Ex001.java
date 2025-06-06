package ex001;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nWhat is the dollar price? R$");
        CurrencyConverter.dollarPrice = read.nextDouble();

        System.out.print("How many dollar will be bought? $");
        double amountDollar = read.nextDouble();

        System.out.printf("Amount to be paid: R$%.2f", CurrencyConverter.dollarToReal(amountDollar));

        read.close();
    }
}
