package application;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;
import db.DBIntegrityException;

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

            System.out.print("\nEnter seller id who you want delete: ");
            int sellerId = read.nextInt();

            command = db.prepareStatement("DELETE FROM seller WHERE Id = ?");
            command.setInt(1, sellerId);
            int rowsAffected = command.executeUpdate();

            if(rowsAffected > 0) System.out.printf("Done! %d rows affected.", rowsAffected);
            else System.out.println("No rows affected!");
        }
        catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
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
