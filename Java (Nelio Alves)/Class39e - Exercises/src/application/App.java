package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = read.nextInt();
            read.nextLine();

            System.out.print("Holder: ");
            String holder = read.nextLine();

            System.out.print("Initial balance: $");
            double balance = read.nextDouble();

            System.out.print("Withdraw limit: $");
            double withdrawLimit = read.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.println("\n" + acc);

            System.out.print("\nEnter amount for withdraw: $");
            double withdrawAmount= read.nextDouble();
            acc.withdraw(withdrawAmount);
            System.out.println("\n" + acc);
        }
        catch(DomainException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(read != null) read.close();
        }
    }
}
