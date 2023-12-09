package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.LineNumberInputStream;
import java.lang.reflect.Array;
import java.util.*;

import static com.example.freightsafe.HelloApplication.*;

public class checklistController {

    @FXML
    RadioButton serviceBrakes;
    @FXML
    RadioButton parkingBrakes;
    @FXML
    RadioButton steering;
    @FXML
    RadioButton reflectorLights;
    @FXML
    RadioButton tires;
    @FXML
    RadioButton horn;
    @FXML
    RadioButton windshieldWipers;
    @FXML
    RadioButton rearviewMirrors;
    @FXML
    RadioButton couplingDevices;
    @FXML
    RadioButton wheelRims;
    @FXML
    RadioButton emergencyEquipment;
    @FXML
    private AnchorPane anchorPane;
    private Scene scene;



    private boolean areAnyButtonsNotSelected() {
        Set<Node> nodes = anchorPane.lookupAll(".radio-button");
        for(Node node: nodes){
            RadioButton curButton = (RadioButton) node;
            if (!curButton.isSelected()) {
                return true; // At least one button is not selected
            }
        }
        return false; // All buttons are selected*/

    }

    @FXML
    public void subMitbutton() throws IOException {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Please resolve issues, then re-perform inspection.");
        a.setTitle("FreightSafe");
        a.setHeaderText("One or more systems unchecked!");
        if (areAnyButtonsNotSelected()){
            a.show();
        }else {
            scene = new Scene(loadFXML("drivelog.fxml"));
            setScene(scene);
            setStage();
        }

    }



}
