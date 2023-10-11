module com.example.freightsafe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.freightsafe to javafx.fxml;
    exports com.example.freightsafe;
}