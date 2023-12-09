package com.example.freightsafe;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.sql.SQLException;
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
    public void submitHandler() throws SQLException, ClassNotFoundException {
        DataLoader timehandler = new DataLoader();
        timehandler.connectDB();
        System.out.println("Submitting");
        Long clockinTime = convertToMilliseconds(clockinText.getText());
        Long breakoutTime = convertToMilliseconds(breakoutText.getText());
        Long breakinTime = convertToMilliseconds(breakinText.getText());
        Long clockoutTime = convertToMilliseconds(clockoutText.getText());

        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText("Compliance Breached!");
        a.setTitle("FreightSafe");
        a.setHeaderText("WARNING! Compliance Breached!");

        if ((clockoutTime - clockinTime) >
                (HOUR_MS * 11L)){
            a.setContentText("Cannot drive more than 11 hours!");
            a.show();
        }
        if(((clockoutTime - clockinTime) >= (HOUR_MS * 8L)) && (breakinTime == 0)){
            a.setContentText("30 minute break required!");
            a.show();
        }
        System.out.println("reached");
        String clockin = msConvert(clockinTime);
        String clockout = msConvert(clockoutTime);
        String breakin = msConvert(breakinTime);
        String breakout = msConvert(breakoutTime);
        timehandler.addTime(clockin, clockout, breakin, breakout);

    }

    public static long convertToMilliseconds(String time) {
        String[] parts = time.split(":");


        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);


        long totalMilliseconds = (hours * 60L + minutes) * 60L * 1000L;

        return totalMilliseconds;
    }
    public static String msConvert(long milliseconds) {
        long seconds = milliseconds / 1000;

        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;

        String timeFormat = String.format("%02d:%02d", hours, minutes);

        return timeFormat;
    }

}
