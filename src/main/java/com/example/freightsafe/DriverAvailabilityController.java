package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DriverAvailabilityController implements Initializable {

    @FXML
    private Label nameLabel,licenseNumLabel,phoneLabel,hasCDLLabel,cdlClassLabel,under21Label,hoursDrivenLLabel, isAvailableLabel,hasTakenBreak;

    @FXML
    private TableView<Driver> tv;

    @FXML
    private TableColumn<Driver, String> driverTVname;
    @FXML
    private TableColumn<Driver, Boolean> driverTVcdl, driverTVavailability;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        driverTVname.setCellValueFactory(new PropertyValueFactory<>("name"));
        driverTVcdl.setCellValueFactory(new PropertyValueFactory<>("hasCDL"));
        driverTVavailability.setCellValueFactory(new PropertyValueFactory<>("isAvailable"));



    }
}
