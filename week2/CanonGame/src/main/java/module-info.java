module com.nhnacademy {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.nhnacademy;
    opens com.nhnacademy to javafx.fxml;
}