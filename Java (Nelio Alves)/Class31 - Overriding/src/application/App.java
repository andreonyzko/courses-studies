package application;

import java.util.Scanner;

import entities.BusinessAccount;
import entities.SavingAccount;

public class App {

    static Scanner read= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("=-=-=-=-=- MENU -=-=-=-=-=-=");
        System.out.println("1- Business Account");
        System.out.println("2- Saving Account");
        System.out.print("Choice: ");
        int choice = read.nextInt();
        
        switch (choice) {
            case 1:
                BusinessAccount();
                break;

            case 2:
                SavingAccount();
                break;
        
            default:
                System.out.println("Invalid option");
                break;
        }

        read.close();
    }

    public static void BusinessAccount(){
        System.out.println("\nEnter account datas");
        System.out.print("Number: ");
        int numberAcc = read.nextInt();
        read.nextLine();
        System.out.print("Holder: ");
        String holderAcc = read.nextLine();
        System.out.print("Enter loan limit: $");
        double loanLimit = read.nextDouble();

        BusinessAccount acc = new BusinessAccount(numberAcc, holderAcc, 0, loanLimit);

        System.out.println("\nNEW ACCOUNT:");
        System.out.println(acc);

        System.out.print("\nEnter a value to deposit: ");
        acc.deposit(read.nextDouble());

        System.out.println("\nUPDATED DATA:");
        System.out.println(acc);

        System.out.print("\nEnter a value to loan: ");
        acc.loan(read.nextDouble());

        System.out.println("\nUPDATED DATA:");
        System.out.println(acc);

        System.out.print("\nEnter a value to widraw: ");
        acc.withdraw(read.nextDouble());

        System.out.println("\nUPDATED DATA:");
        System.out.println(acc);
    }

    public static void SavingAccount(){
        System.out.println("\nEnter account datas");
        System.out.print("Number: ");
        int numberAcc = read.nextInt();
        read.nextLine();
        System.out.print("Holder: ");
        String holderAcc = read.nextLine();
        System.out.print("Enter interest percentege: ");
        double interestRate = read.nextDouble();

        SavingAccount acc = new SavingAccount(numberAcc, holderAcc, 0, interestRate);

        System.out.println("\nNEW ACCOUNT:");
        System.out.println(acc);

        System.out.print("\nEnter a value to deposit: ");
        acc.deposit(read.nextDouble());

        System.out.println("\nUPDATED DATA:");
        System.out.println(acc);

        System.out.print("\nEnter a value to widraw: ");
        acc.withdraw(read.nextDouble());

        System.out.println("\nUPDATED DATA:");
        System.out.println(acc);

        acc.updateBalance();
        System.out.println("\nACCOUNT PAID OFF:");
        System.out.println(acc);
    }
}
