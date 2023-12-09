package com.example.freightsafe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class HelloApplication extends Application {

    public static Scene scene;
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = new Stage();
        Scene scene = new Scene(loadFXML("drivelog.fxml"));
        setScene(scene);
        setStage();
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        launch();
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        return fxmlLoader.load();
    }

    public static Scene getScene() {
        return scene;
    }

    public static void setScene(Scene s) {
        scene = s;
    }

    public static void setStage(){
        stage.setScene(getScene());
        stage.show();
    }

}