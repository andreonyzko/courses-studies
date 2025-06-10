package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;
// import services.USATaxService;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental details");
        System.out.print("Vehicle model: ");
        String vehicleModel = read.nextLine();
        System.out.print("Start (DD/MM/YYYY HH:MM): ");
        LocalDateTime startDate= LocalDateTime.parse(read.nextLine(),dateformat);
        System.out.print("End (DD/MM/YYYY HH:MM): ");
        LocalDateTime finishDate= LocalDateTime.parse(read.nextLine(),dateformat);
        CarRental carRental = new CarRental(startDate, finishDate, new Vehicle(vehicleModel));

        System.out.print("Per hour: $");
        double perHour = read.nextDouble();
        System.out.print("Per day: $");
        double perDay = read.nextDouble();
        RentalService rentalService = new RentalService(perHour, perDay, new BrazilTaxService());
        // RentalService rentalService = new RentalService(perHour, perDay, new USATaxService());

        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice());

        read.close();
    }
}
