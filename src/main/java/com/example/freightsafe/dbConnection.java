package com.example.freightsafe;
import java.sql.*;

public class dbConnection {
    Connection conn = null;
    public static Connection dbConnector() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://runtracker.accdb");
            return conn;
        } catch (Exception e) {

            return null;
        }
    }
    public static Connection dbConnector2() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://runtracker.accdb");

            return conn;
        } catch (Exception e) {
            return null;
        }
    }
}
