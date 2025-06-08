package ex001.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex001.entities.Employee;
import ex001.entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Employee> emplooyes = new ArrayList<>();

        System.out.print("\nHow many employees will be entered? ");
        int amountEmplooyes = read.nextInt();
        read.nextLine();

        for(int i=0; i < amountEmplooyes; i++){
            System.out.println("\nEnter #" + (i+1) + " employee data");
            System.out.print("Name: ");
            String employeeName = read.nextLine();
            System.out.print("Hours: ");
            int hoursEmployee = read.nextInt();
            System.out.print("Value per hour: $");
            double valuePerHourEmployee = read.nextDouble();
            read.nextLine();
            System.out.print("Out sourced Employee? (y/n) ");
            char sourced = read.nextLine().toLowerCase().charAt(0);
            if(sourced == 'y'){
                System.out.print("Additional charge: $");
                double additionalCharge = read.nextDouble();
                read.nextLine();
                emplooyes.add(new OutsourcedEmployee(employeeName, hoursEmployee, valuePerHourEmployee, additionalCharge));
            }
            else{
                emplooyes.add(new Employee(employeeName, hoursEmployee, valuePerHourEmployee));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for(Employee employee : emplooyes){
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }

        read.close();
    }
}
