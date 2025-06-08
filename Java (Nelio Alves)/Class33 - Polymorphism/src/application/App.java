package application;

import entities.Account;
import entities.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(1020, "Andre", 1000);
        Account sacc = new SavingAccount(1023, "Kadu", 1000, 10);

        acc.withdraw(50);
        sacc.withdraw(50);

        System.out.println(acc);
        System.out.println(sacc);
    }
}
