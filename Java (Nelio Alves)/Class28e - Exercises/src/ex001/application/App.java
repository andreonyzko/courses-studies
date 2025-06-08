package ex001.application;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ex001.entities.Departament;
import ex001.entities.HourContract;
import ex001.entities.Worker;
import ex001.entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter departament's name: ");
        Departament departament = new Departament(read.nextLine());

        System.out.println("\nEnter worker data: ");
        System.out.print("Name: ");
        String name = read.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(read.nextLine());
        System.out.print("Base salary: $");
        Worker worker = new Worker(name, level, read.nextDouble(), departament);
        
        System.out.println("How many contracts to this worker? ");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int contractAmount = read.nextInt();
        read.nextLine();
        
        for(int i=0; i < contractAmount; i++){
            System.out.println("\nEnter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(read.nextLine(), dateFormat);
            System.out.print("Value per hour: ");
            double valuePerHour = read.nextDouble();
            read.nextLine();
            System.out.print("Durantion: ");
            worker.addContract(new HourContract(date, valuePerHour, read.nextInt()));
            read.nextLine();
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY) ");
        String monthYear = read.nextLine();  // Ex: 06/2025
        String[] parts = monthYear.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        System.out.println(worker);
        System.out.printf("Income for %d/%d: ", month, year);
        System.out.print(worker.income(year, month));

        read.close();
    }
}
