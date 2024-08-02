package com.tapfoods.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**  
 * The DBUtils class provides a utility method to establish a connection to the database.
 */
public class DBUtils {
    
    private static Connection con = null;
    private static final String URL = "jdbc:mysql://localhost:3306/tapfoods";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    /**
     * Establishes and returns a connection to the database.
     * 
     * @return a Connection object to the database
     */
    public static Connection myConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
