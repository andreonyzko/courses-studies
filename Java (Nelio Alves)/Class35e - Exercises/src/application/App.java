package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Payer> payers = new ArrayList<>();

        System.out.print("How many tax payers will be entered? ");
        int payersAmount = read.nextInt();
        read.nextLine();

        for(int i=0; i < payersAmount; i++){
            System.out.println("\nTax payer #" + (i+1) + " data:");
            System.out.print("Individual or company? ");
            String type = read.nextLine().toLowerCase().trim();

            System.out.print("Name: ");
            String name = read.nextLine();

            System.out.print("Anual income: $");
            double anualIncome = read.nextDouble();
            read.nextLine();

            if(type.equals("individual")){
                System.out.print("Health expenditures: $");
                double healthExpenditures = read.nextDouble();
                read.nextLine();
                payers.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if(type.equals("company")){
                System.out.print("Number of employees: ");
                int employees = read.nextInt();
                read.nextLine();
                payers.add(new Company(name, anualIncome, employees));
            }
            else{
                System.out.println("Invalid payer type!");
            }
        }

        System.out.println("\nTAXES PAID: ");
        double totalTaxes = 0;
        for(Payer payer : payers){
            System.out.printf("%s: $%.2f\n", payer.getName(), payer.taxpaid());
            totalTaxes += payer.taxpaid();
        }

        System.out.printf("\nTOTAL TAXES: $%.2f", totalTaxes);

        read.close();
    }
}
