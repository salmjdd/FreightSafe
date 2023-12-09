package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class drivelogController {
    @FXML
    public Text dateText;
    @FXML
    public TextField clockinText;
    @FXML
    public TextField breakoutText;
    @FXML
    public TextField breakinText;
    @FXML
    public TextField clockoutText;
    final long HOUR_MS = 3600000;
    @FXML
    public void initialize(){
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        String formatted = df.format(new Date());
        dateText.setText("Date: " + formatted);
    }

    @FXML
    public void submitHandler() throws IOException {
        System.out.println("Submitting");
        String clockinTime = clockinText.getText();
        String breakoutTime = breakoutText.getText();
        String breakinTime = breakinText.getText();
        String clockoutTime = clockoutText.getText();

        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText("Compliance Breached!");
        a.setTitle("FreightSafe");
        a.setHeaderText("WARNING!");

        System.out.println("clockout " + convertToMilliseconds(clockoutTime));
        System.out.println("clockin " + convertToMilliseconds(clockinTime));
        System.out.println("11 hours" + HOUR_MS * 11L);
        if ((convertToMilliseconds(clockoutTime) - convertToMilliseconds(clockinTime)) >
                (HOUR_MS * 11L)){
            a.show();
        }

        Scene scene = new Scene (HelloApplication.loadFXML("driverAvailabilityView.fxml"));
        HelloApplication.setScene(scene);
        HelloApplication.setStage();
        }

    public static long convertToMilliseconds(String time) {
        String[] parts = time.split(":");


        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);


        long totalMilliseconds = (hours * 60L + minutes) * 60L * 1000L;

        return totalMilliseconds;
    }

}
