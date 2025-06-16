package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);
        Connection db = null;
        PreparedStatement command = null;

        System.out.print("Enter seller name: ");
        String name = read.nextLine();
        
        System.out.print("Enter seller email: ");
        String email = read.nextLine();

        System.out.print("Enter seller birthdate (DD/MM/YYYY): ");
        LocalDate birthdate = LocalDate.parse(read.nextLine(), dateformat);

        System.out.print("Enter seller base salary: $");
        double baseSalary = read.nextDouble();

        System.out.print("Enter seller departament id: ");
        int departamentId = read.nextInt();

        try {
            db = DB.getConnection();
            command = db.prepareStatement(
                "INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );

            command.setString(1, name);
            command.setString(2, email);
            command.setDate(3, java.sql.Date.valueOf(birthdate));
            command.setDouble(4, baseSalary);
            command.setInt(5, departamentId);

            int rowsAffected = command.executeUpdate();
            if(rowsAffected > 0){
                System.out.printf("\nDone! %d rows created.\n", rowsAffected);
                ResultSet result = command.getGeneratedKeys();
                while(result.next()){
                    int id = result.getInt(1);
                    System.out.println("Seller received id " + id + ".");
                }
            }
            else System.out.printf("\nNo rows affected");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(command);
            DB.closeConnection();
            read.close();
        }
    }
}
