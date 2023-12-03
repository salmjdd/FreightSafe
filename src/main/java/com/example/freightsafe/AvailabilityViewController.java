package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AvailabilityViewController implements Initializable {


    @FXML
    private TableColumn<EquipmentUnit,Integer> tvNumber;

    @FXML
    private TableColumn<EquipmentUnit,Double> tvMiles;
    @FXML
    private TableColumn<EquipmentUnit,Boolean> tvAvailablity;

    @FXML
    private TableView<EquipmentUnit> tv;


    /**
     * the tableviw displays an observable list of EquipmentUnits.
     *
     * however, since there are dif types, im chosing to diplay all the units as an
     * equipment unit an just showing the vields of the parent class.
     *
     * above i have declared 5 labels, my intention is that when a user selects a truck from
     * the tableview, we can set the labels with all 5 fields of the object.
     * im not sure if you can/how to create an observable list of 2 dif data types, but
     * both are of Equipment class.
     *
     * we could just do a database query of the selection to pull the full information
     * profile og that truck. with the query, we can use set text methods to display the info
     *
     *
     *
     */
    @FXML
    private Label numberLabel, milesLabel, weightLabel, lengthLabel, availabilityLabel;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //open connection


        tvNumber.setCellValueFactory(new PropertyValueFactory<>("truckNumber"));
        tvMiles.setCellValueFactory(new PropertyValueFactory<>("milesDriven"));
        tvAvailablity.setCellValueFactory(new PropertyValueFactory<>("isAvailable"));






    }
}
