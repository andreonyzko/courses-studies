package ex001.application;

import java.util.Scanner;

import ex001.entities.Account;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Account account;
        System.out.print("\nEnter account number: ");
        int accountNumber = read.nextInt();
        read.nextLine();

        System.out.print("Enter account holder: ");
        String holder = read.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        if(read.next().toLowerCase().charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: $");
            account = new Account(accountNumber, holder, read.nextDouble());
        } 
        else{
            account = new Account(accountNumber, holder);
        }

        System.out.println("\nAccount data: \n" + account);

        System.out.print("\nEnter a deposit value: $");
        account.deposit(read.nextDouble());

        System.out.println("\nUpdated data: \n" + account);

        System.out.print("\nEnter a withdraw vaue: $");
        account.withdraw(read.nextDouble());

        System.out.println("\nUpdated data: \n" + account);

        read.close();
    }
}
