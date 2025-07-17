module com.nhnacademy {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive javafx.graphics;
    requires java.desktop;

    opens com.nhnacademy to javafx.fxml;

    exports com.nhnacademy;
}
