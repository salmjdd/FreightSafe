package com.example.freightsafe;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DriverAvailabilityController implements Initializable {

    @FXML
    private Label nameLabel,licenseNumLabel,phoneLabel,hasCDLLabel,cdlClassLabel,under21Label,hoursDrivenLLabel, isAvailableLabel,hasTakenBreak;

    @FXML
    private TableView<Driver> tv;

    @FXML
    private TableColumn<Driver, String> driverTVname;
    @FXML
    private TableColumn<Driver, String> driverTVcdl, driverTVavailability;
    @FXML
    private Button returnButton;

    private Scene scene;

    private ObservableList<Driver> data =
            FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        driverTVname.setCellValueFactory(new PropertyValueFactory<>("name"));
        driverTVcdl.setCellValueFactory(new PropertyValueFactory<>("hasCDL"));
        driverTVavailability.setCellValueFactory(new PropertyValueFactory<>("isAvailable"));
        tv.setItems(data);
        //we have to populate the observabale list upon initializaiton with the database info

        try {
            loadDriverInfo();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        returnButton.setOnMouseClicked(e->{
            try {
                scene = new Scene(HelloApplication.loadFXML("agentLandingPage.fxml"));
                HelloApplication.setScene(scene);
                HelloApplication.setStage();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });

    }

    void loadDriverInfo() throws SQLException, ClassNotFoundException, IOException {
        DataLoader driverLoader = new DataLoader();
        driverLoader.connectDB();
        driverLoader.loadData();
        System.out.println("loaded");

        for (int i = 0; i < driverLoader.driverList.size(); i++) {
            Driver curDriver = driverLoader.driverList.get(i);
            tv.getItems().add(curDriver);
        }
    }
}
