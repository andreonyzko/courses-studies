package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class App {
    static List<Account> accounts = new ArrayList<>();
    static Scanner read= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("How many accounts will be entered? ");
        int accountAmount = read.nextInt();
        read.nextLine();

        for(int i=0; i < accountAmount; i++){
            System.out.print("\nBusiness or Saving Account? ");
            String type = read.nextLine().toLowerCase().trim();
            if(type.equals("business")){
                BusinessAccount();
            }
            else if(type.equals("saving")){
                SavingAccount();
            }
            else{
                System.out.println("Invalid account type");
            }
        }

        double sum=0;
        for(Account acc : accounts){
            sum += acc.getBalance();
        }

        System.out.printf("\nTotal balance: %.2f\n", sum);

        for(Account acc : accounts){
            acc.deposit(10);
            System.out.printf("Updated balance for account %d: $%.2f\n", acc.getNumber(), acc.getBalance());
        }

        sum=0;
        for(Account acc : accounts){
            sum += acc.getBalance();
        }

        System.out.printf("\nUpdated Total balance: %.2f\n", sum);

        read.close();
    }

    public static void BusinessAccount(){
        System.out.println("Enter account datas");
        System.out.print("Number: ");
        int numberAcc = read.nextInt();
        read.nextLine();
        System.out.print("Holder: ");
        String holderAcc = read.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = read.nextDouble();
        System.out.print("Enter loan limit: $");
        double loanLimit = read.nextDouble();
        read.nextLine();

        BusinessAccount acc = new BusinessAccount(numberAcc, holderAcc, initialBalance, loanLimit);

        System.out.println("\nNEW ACCOUNT:");
        System.out.println(acc);
        accounts.add(acc);
    }

    public static void SavingAccount(){
        System.out.println("Enter account datas");
        System.out.print("Number: ");
        int numberAcc = read.nextInt();
        read.nextLine();
        System.out.print("Holder: ");
        String holderAcc = read.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = read.nextDouble();
        System.out.print("Enter interest percentege: ");
        double interestRate = read.nextDouble();
        read.nextLine();

        SavingAccount acc = new SavingAccount(numberAcc, holderAcc, initialBalance, interestRate);

        System.out.println("\nNEW ACCOUNT:");
        System.out.println(acc);
        accounts.add(acc);
    }
}
