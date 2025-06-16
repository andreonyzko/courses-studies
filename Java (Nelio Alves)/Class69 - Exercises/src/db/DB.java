package db;

import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection connection = null;

    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } 
        catch (Exception e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection(){
        try {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            connection = DriverManager.getConnection(url, props);
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

        return connection;
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } 
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st){
        try {
            st.close();
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet rs){
        try{
            rs.close();
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}
