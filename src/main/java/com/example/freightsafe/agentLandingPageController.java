package com.example.freightsafe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;

import java.io.IOException;
import java.sql.SQLException;

public class agentLandingPageController {
    public Scene scene;
    @FXML
    public void viewDriversHandler(ActionEvent event) throws IOException {
        //switch to driverAvailabilityController
        scene = HelloApplication.getScene();
        System.out.println("fix me! in agent landing page controller");
        System.out.println("fix me! in agent landing page controller");
        System.out.println("fix me! in agent landing page controller");
        System.out.println("fix me! in agent landing page controller");
        scene = new Scene(HelloApplication.loadFXML("driverAvailabilityView.fxml"));
        HelloApplication.setScene(HelloApplication.scene);
        HelloApplication.setStage();
    }

    @FXML
    public void viewTrucksHandler(ActionEvent event) throws IOException {
        //switch to AvailabilityViewController
        scene = HelloApplication.getScene();

        scene = new Scene(HelloApplication.loadFXML("availabilityView.fxml"));
        HelloApplication.setScene(scene);
        HelloApplication.setStage();
    }

}
