package com.example.freightsafe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class agentLandingPageController{
    private Scene scene;

    @FXML
    private Button driverButton, equipmentButton;





    @FXML
    public void viewDriversHandler() throws IOException {
        //switch to driverAvailabilityController
        scene = HelloApplication.getScene();
        System.out.println("here");
        scene = new Scene(HelloApplication.loadFXML("driverAvailabilityView.fxml"));
        HelloApplication.setScene(scene);
        HelloApplication.setStage();
        System.out.println("here 3");
    }

    @FXML
    public void viewTrucksHandler() throws IOException {
        //switch to AvailabilityViewController
        scene = HelloApplication.getScene();
        scene = new Scene(HelloApplication.loadFXML("availabilityView.fxml"));
        HelloApplication.setScene(scene);
        HelloApplication.setStage();
    }


}
