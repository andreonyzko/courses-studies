package application;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        Connection db = null;
        Statement consult = null;
        ResultSet result = null;

        try {
            db = DB.getConnection();
            consult = db.createStatement();
            result = consult.executeQuery("SELECT * FROM department");

            while(result.next()){
                System.out.printf("[%d] %s\n", result.getInt("Id"), result.getString("Name"));
            }
        } 
        catch (SQLException e) {
           e.printStackTrace();
        }
        finally{
            DB.closeStatement(consult);
            DB.closeResultSet(result);
            DB.closeConnection();
        }
    }
}
