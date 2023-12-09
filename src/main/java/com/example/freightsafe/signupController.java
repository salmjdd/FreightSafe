package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.SQLException;

public class signupController {
    @FXML
    public RadioButton driverButton;
    @FXML
    public RadioButton agentButton;
    @FXML
    public TextField userText;
    @FXML
    public TextField passwordText;
    @FXML
    public Text text;

    private Scene scene;

    @FXML
    public void signupHandler() throws SQLException, ClassNotFoundException, IOException {
        String username = userText.getText();
        String password = passwordText.getText();
        DataLoader signup = new DataLoader();
        signup.connectDB();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Signup complete!");
        a.setTitle("FreightSafe");
        a.setHeaderText("Please login!");
        if (driverButton.isSelected()){
            signup.addDriver(username, password);
            a.show();
            scene = new Scene(HelloApplication.loadFXML("hello-view.fxml"));
            HelloApplication.setScene(scene);
            HelloApplication.setStage();
        } else if (agentButton.isSelected()){
            signup.addAgent(username, password);
            a.show();
            scene = new Scene(HelloApplication.loadFXML("hello-view.fxml"));
            HelloApplication.setScene(scene);
            HelloApplication.setStage();
        } else {
            text.setText("Make a selection!");
        }
    }
}
