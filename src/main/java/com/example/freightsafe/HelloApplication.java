package com.example.freightsafe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
       EquipmentInspection day1 = new EquipmentInspection();
        day1.promptUserInput();


        if(day1.checkInspectionReport() == false){
            System.out.println("Inspection failed, please take action");
        } else {
            System.out.println("Inspection passed, drive safe");
        }
        //if inspection is passed continue to log hours window
        DriveLog drive = new DriveLog();
        //clocking in takes current time and stores it as a variable
        drive.clockIn();
        System.out.println(drive.getClockedIn());
        //clocking out takes the current time and stores it as a variable
        drive.clockOut();
        System.out.println(drive.getClockedOut());
        //hours driven is the difference between clock in and clock out time converted into hours
        System.out.println(drive.hoursDriven());

        //to-do: perform algorithm to ensure driver hours are in compliance




    }

}