package com.example.freightsafe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.sql.*;

public class DataLoader {
    Scanner reader = new Scanner(System.in);
    String userID;
    Hashtable<String, String> driverHash;
    Hashtable<String, String> agentHash;
    ArrayList<EquipmentUnit> truckList = new ArrayList<EquipmentUnit>();
    ArrayList<Driver> driverList = new ArrayList<Driver>();
    //database objects
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    Double truckID;
    Double milesDriven;
    Double grossWeight;
    Double vehicleLength;
    String isAvailable;
    String truckType;

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
        loadTruck();
        loadDriver();
        connection.close();
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

    void loadTruck() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM truck");

        while (resultSet.next()) {

            truckID = Double.parseDouble(resultSet.getString(1));
            milesDriven = Double.parseDouble(resultSet.getString(2));
            grossWeight = Double.parseDouble(resultSet.getString(3));
            vehicleLength = Double.parseDouble(resultSet.getString(4));
            isAvailable = resultSet.getString(5);
            truckType = resultSet.getString(6);
            System.out.println(truckType);
            if (truckType.equals("CDL")){
                truckList.add(new cdlUnit(truckID, milesDriven, isAvailable, grossWeight, vehicleLength));
            } else {
                truckList.add(new nonCDLUnit(truckID, milesDriven, isAvailable, grossWeight, vehicleLength));
            }

        } // fin. retrieving from table...
        System.out.println("Agent Hashtable loaded!");
    }

    void loadDriver() throws SQLException{
        resultSet = statement.executeQuery("SELECT * FROM driverinfo");

        while (resultSet.next()) {

            String fullName = resultSet.getString(1);
            String hasCDL = resultSet.getString(2);
            String isAvailable = resultSet.getString(3);
            String licenseNum = resultSet.getString(4);
            String phoneNum = resultSet.getString(5);
            String cdlClass = resultSet.getString(6);
            String under21 = resultSet.getString(7);
            String hoursDriven = resultSet.getString(8);
            String hasTakenBreak = resultSet.getString(9);

            driverList.add(new Driver(fullName, Long.parseLong(licenseNum), Long.parseLong(phoneNum),
                    hasCDL, cdlClass, under21, Double.parseDouble(hoursDriven), isAvailable,
                    hasTakenBreak));

        }

        System.out.println("Drivers Loaded");
    }

    void addDriver(String username, String password) throws SQLException {
        System.out.println("INSERT INTO driver (username, password) VALUES (" +
                username + ", " +  password + ")");
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO driver(username, password) values (?, ?)");
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.executeUpdate();
        connection.close();
    }

    void addAgent(String username, String password) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO agent(username, password) values (?, ?)");
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.executeUpdate();
        connection.close();
    }


}
