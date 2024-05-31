module com.example.demoorder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires itextpdf;


    opens com.example.demoorder to javafx.fxml;
    exports com.example.demoorder;
}