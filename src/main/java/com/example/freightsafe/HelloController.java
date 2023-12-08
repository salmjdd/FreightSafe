package com.example.freightsafe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;

public class HelloController {
    @FXML
    public TextField userText;
    @FXML
    public PasswordField passwordText;
    @FXML
    public Text statusText;
    private Scene scene;

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
        test1.connection.close();
        String user = "", pass = "", enteredpass = "";
        String userID = "";

            user = userText.getText();

            if ((!driverHash.containsKey(user) && (!agentHash.containsKey(user)))){
                statusText.setText("Invalid username!");
            } else {
                enteredpass = passwordText.getText();
                if(driverHash.containsKey(user)) {
                    pass = (String) driverHash.get(user);
                } else {
                    pass = (String) agentHash.get(user);
                }
                if (!enteredpass.equals(pass)) {
                    statusText.setText("Invalid password!");
                } else {
                    statusText.setText("Login successful!");
                    if(driverHash.containsKey(user)){ //if the username was in the driverHash
                        statusText.setText("Welcome driver");
                        //switch to driver landing page (dont have that yet need to make one)
                        scene = new Scene(HelloApplication.loadFXML("driverLandingPage.fxml"));
                        HelloApplication.setScene(scene);
                        HelloApplication.setStage();

                    }
                    if(agentHash.containsKey(user)){
                        statusText.setText("Welcome agent");
                        //switch to agentLandingPage
                        scene = new Scene(HelloApplication.loadFXML("agentLandingPage.fxml"));
                        HelloApplication.setScene(scene);
                        HelloApplication.setStage();
                    }
                }
            }
        /*System.out.println("DELETE ME ONCE DATABASE IS WORKING");
        System.out.println("DELETE ME ONCE DATABASE IS WORKING");
        System.out.println("DELETE ME ONCE DATABASE IS WORKING");
        System.out.println("DELETE ME ONCE DATABASE IS WORKING");

        //delete the code below so only registered users can enter the app

        scene = new Scene(HelloApplication.loadFXML("agentLandingPage.fxml"));
        HelloApplication.setScene(scene);
        HelloApplication.setStage();*/

    }
}