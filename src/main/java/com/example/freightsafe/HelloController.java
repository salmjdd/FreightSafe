package com.example.freightsafe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;

public class HelloController {
    @FXML
    public TextField userText;
    @FXML
    public TextField passwordText;
    public DataLoader test1 = new DataLoader();


    public void initialize() throws SQLException, ClassNotFoundException, IOException {
        test1.connectDB();
        test1.loadData();

    }

    @FXML
    public void loginHandler(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        System.out.println("test");
        Hashtable driverHash = test1.getDriverHash();
        Hashtable agentHash = test1.getAgentHash();
        String user = "", pass = "", enteredpass = "";
        int numattempts = 0;
        boolean loginValid = false;
        String userID = "";

        System.out.println("Welcome to FreightSafe");

        do {
            System.out.print("Enter your userID: ");
            user = userText.getText();

            if ((!driverHash.containsKey(user) && (!agentHash.containsKey(user)))){
                System.out.println("Username is Invalid!");
            } else {
                System.out.print("Enter your password: ");
                enteredpass = passwordText.getText();
                pass = (String)driverHash.get(user);
                if (!enteredpass.equals(pass)) {
                    System.out.println("Password is Invalid!");
                } else {
                    loginValid = true;
                    userID = user;
                }
            }
            numattempts++;
        } while ((numattempts < 3) && (!loginValid));
        if (!loginValid) {
            System.out.println("Error: Number of attempts exceeded, program terminated!");
            System.exit(100);
        }
        userID = user;
        System.out.println("Login success!");
    }
}