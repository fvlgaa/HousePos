module com.example.housepos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.housepos to javafx.fxml;
    exports com.example.housepos;
}