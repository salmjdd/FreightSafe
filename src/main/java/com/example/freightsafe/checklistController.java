package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.LineNumberInputStream;
import java.lang.reflect.Array;
import java.util.*;

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
        /*for (Object button: checklist) {
                RadioButton curButton = (RadioButton) button;
                if (!curButton.isSelected()) {
                    System.out.println("a button is not selected");
                    return true; // At least one button is not selected
            }
        }
        return false; // All buttons are selected*/


    @FXML
    public void subMitbutton() {
        if (areAnyButtonsNotSelected()){
            System.out.println("a button is not selected");
            //create an alert that asks user to fix issue
        }else {
            //switch to driver log
            System.out.println("switch to dlog");
        }

    }



}
