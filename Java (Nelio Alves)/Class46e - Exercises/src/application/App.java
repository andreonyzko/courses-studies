package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract details");
        System.out.print("Number: ");
        int contractNumber = read.nextInt();
        read.nextLine();
        System.out.print("Date (DD/MM/YYYY): ");
        LocalDate contractDate = LocalDate.parse(read.nextLine(), dateformat);
        System.out.print("Value: $");
        double contractValue = read.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Installments Number: ");
        int installmentsAmount = read.nextInt();

        new ContractService(new PaypalService()).processContract(contract, installmentsAmount);

        System.out.println("Installments:");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        read.close();
    }
}
