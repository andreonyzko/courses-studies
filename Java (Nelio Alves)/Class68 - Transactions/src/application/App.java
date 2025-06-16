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
        Statement consult = null;
        PreparedStatement command = null;
        ResultSet result = null;

        try {
            System.out.print("Enter amount you want transfer: ");
            double amount = read.nextDouble();
            System.out.println();

            db = DB.getConnection();
            db.setAutoCommit(false);

            consult = db.createStatement();
            result = consult.executeQuery("SELECT * from seller");

            while(result.next()){
                System.out.printf("%d \t%s \t%.2f\n", 
                result.getInt("Id"), 
                result.getString("Email"), 
                result.getDouble("BaseSalary"));
            }

            System.out.print("\nEnter seller id who you want remove: ");
            int sellerId = read.nextInt();
            result = consult.executeQuery("SELECT BaseSalary FROM seller WHERE Id = " + sellerId);
            result.next();
            double sellerBalance = result.getDouble(1);

            command = db.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary - " + amount + " WHERE Id = " + sellerId);
            int rowsAffected = command.executeUpdate();

            if(sellerBalance < amount) throw new SQLException("Insufficient sender balance!");

            System.out.print("\nEnter seller id who you want add: ");
            sellerId = read.nextInt();

            command = db.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + " + amount + " WHERE Id = " + sellerId);
            rowsAffected += command.executeUpdate();

            db.commit();

            System.out.printf("Done! %d rows affected", rowsAffected);
        }
        catch (SQLException e) {
            db.rollback();
            System.out.println(e.getMessage());;
        }
        finally{
            DB.closeStatement(command);
            DB.closeResultSet(result);
            DB.closeConnection();
            read.close();
        }
    }
}
