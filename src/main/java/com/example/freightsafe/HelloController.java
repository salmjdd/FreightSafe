package com.example.freightsafe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public TextField userText;
    @FXML
    public TextField passwordText;
    @FXML
    public Text statusText;
    public DataLoader test1 = new DataLoader();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            test1.connectDB();
            test1.loadData();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void loginHandler(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        System.out.println("test");
        Hashtable driverHash = test1.getDriverHash();
        Hashtable agentHash = test1.getAgentHash();
        String user = "", pass = "", enteredpass = "";
        int numattempts = 0;
        String userID = "";

            user = userText.getText();

            if ((!driverHash.containsKey(user) && (!agentHash.containsKey(user)))){
                statusText.setText("Invalid username!");
            } else {
                enteredpass = passwordText.getText();
                pass = (String)driverHash.get(user);
                if (!enteredpass.equals(pass)) {
                    statusText.setText("Invalid password!");
                } else {
                    statusText.setText("Login successful!");
                }
            }


    }


}