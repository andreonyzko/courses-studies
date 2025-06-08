package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        // Upcasting
        Account acc = new BusinessAccount(10102020, "André", 0, 1000);
        System.out.println("\n" + acc);
        Account acc2 = new SavingAccount(20201010, "Kadu", 1000, 10);
        System.out.println("\n" + acc2);

        // Downcasting
        if(acc instanceof BusinessAccount){
            BusinessAccount acc3 = (BusinessAccount)acc;
            System.out.println("\nBUSINESS ACCOUNT\n" + acc3);
        }
        else{
            SavingAccount acc3 = (SavingAccount)acc;
            System.out.println("\nSAVING ACCOUNT\n" + acc3);
        }

        if(acc2 instanceof BusinessAccount){
            BusinessAccount acc4 = (BusinessAccount)acc2;
            System.out.println("\nBUSINESS ACCOUNT\n" + acc4);
        }
        else{
            SavingAccount acc4 = (SavingAccount)acc2;
            System.out.println("\nSAVING ACCOUNT\n" + acc4);
        }
    }
}
