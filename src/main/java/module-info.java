module com.example.freightsafe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.freightsafe to javafx.fxml;
    exports com.example.freightsafe;
}