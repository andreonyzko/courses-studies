package ex002.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex002.entities.Account;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Account> accs = new ArrayList<>();
        String path = "src\\ex002\\file.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String fields[] = line.split(",");
                accs.add(new Account(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter minimus balance: ");
            double minBalance = read.nextDouble();

            System.out.printf("Email of people whose balance is more than $%.2f:\n", minBalance);
            accs.stream().filter(x -> x.getBalance() >= minBalance).forEach(x -> System.out.println(x.getEmail()));

            System.out.print("\nEnter people start name letter whose you want sum balances: ");
            char letter = read.next().toUpperCase().charAt(0);

            double sum = accs.stream()
            .filter(x -> x.getHolder().toUpperCase().charAt(0) == letter)
            .map(x -> x.getBalance())
            .reduce(0.0, (x, y) -> x + y);

            System.out.printf("Sum of balance of people whose name starts with '%c': $%.2f", letter, sum);
        } 
        catch (IOException e) {
            System.out.println("Error reading file");
        }
        
        read.close();
    }
}
