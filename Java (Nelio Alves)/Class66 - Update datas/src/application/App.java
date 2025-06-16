package application;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Connection db = null;
        PreparedStatement command = null;
        Statement consult = null;
        ResultSet result = null;

        try {
            db = DB.getConnection();

            consult = db.createStatement();
            result = consult.executeQuery("SELECT * from seller");

            while(result.next()){
                System.out.printf("%d \t%s \t%.2f\n", 
                result.getInt("Id"), 
                result.getString("Email"), 
                result.getDouble("BaseSalary"));
            }

            System.out.print("\nEnter seller id who you want update salary: ");
            int sellerId = read.nextInt();

            System.out.print("\nEnter new salary: $");
            double newSalary = read.nextDouble();

            command = db.prepareStatement("UPDATE seller SET BaseSalary = ? WHERE Id = ?");
            command.setDouble(1, newSalary);
            command.setInt(2, sellerId);
            int rowsAffected = command.executeUpdate();
            if(rowsAffected > 0) System.out.printf("Done! %d rows affected.", rowsAffected);
            else System.out.println("No rows affected!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(command);
            DB.closeStatement(consult);
            DB.closeResultSet(result);
            DB.closeConnection();
            read.close();
        }
    }
}
