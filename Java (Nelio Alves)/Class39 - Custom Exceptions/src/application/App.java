package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int roomNumber = read.nextInt();
            read.nextLine();

            System.out.print("Check-in (DD/MM/YYYY): ");
            LocalDate checkin = LocalDate.parse(read.nextLine(), dateformat);

            System.out.print("Check-out (DD/MM/YYYY): ");
            LocalDate checkout = LocalDate.parse(read.nextLine(), dateformat);

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in (DD/MM/YYYY): ");
            checkin = LocalDate.parse(read.nextLine(), dateformat);

            System.out.print("Check-out (DD/MM/YYYY): ");
            checkout = LocalDate.parse(read.nextLine(), dateformat);

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
        finally{
            read.close();
        }
    }
}
