package com.example.freightsafe;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;
import java.sql.*;

public class DataLoader {
    Scanner reader = new Scanner(System.in);
    String userID;
    Hashtable<String, String> driverHash;
    Hashtable<String, String> agentHash;
    //database objects
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    //default constructor
    public DataLoader(){
        driverHash = new Hashtable<>();
        agentHash = new Hashtable<>();
        userID = "";

        connection = null;
        statement = null;
        resultSet = null;
    }

    void connectDB() throws ClassNotFoundException, SQLException {

        // Step 1: Loading or registering JDBC driver class
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        // Step 2: Opening database connection
        String msAccDB = "FreightSafe.accdb";
        String dbURL = "jdbc:ucanaccess://" + msAccDB;

        // Step 3: Create and get connection using DriverManager class
        connection = DriverManager.getConnection(dbURL);

        // Step 4: Creating JDBC Statement - scrollable (use next() and last()) &
        // updatable (enter records)
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        System.out.println("Database Connected!");
    }

    public Hashtable<String, String> getDriverHash() {
        return driverHash;
    }

    public Hashtable<String, String> getAgentHash() {
        return agentHash;
    }

    void loadData() throws SQLException {
        loadDriverHashtable();
        loadAgentHashtable();
    }

    void loadDriverHashtable() throws SQLException {
        String userID = "", password = "";

        // Get the total rows in the table to loop through the result set
        resultSet = statement.executeQuery("SELECT * FROM driver");

        while (resultSet.next()) {

            userID = resultSet.getString(1);
            password = resultSet.getString(2);

            // Add the product aisles to the hashtable
            driverHash.put(userID, password);
        } // fin. retrieving from table...
        System.out.println("Driver Hashtable loaded!");

    }

    void loadAgentHashtable() throws SQLException {
        String userID = "", password = "";

        // Get the total rows in the table to loop through the result set
        resultSet = statement.executeQuery("SELECT * FROM agent");

        while (resultSet.next()) {

            userID = resultSet.getString(1);
            password = resultSet.getString(2);

            // Add the product aisles to the hashtable
            agentHash.put(userID, password);
        } // fin. retrieving from table...
        System.out.println("Agent Hashtable loaded!");

    }


}
