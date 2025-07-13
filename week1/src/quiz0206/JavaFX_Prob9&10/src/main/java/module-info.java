module com.example.javafx_prob9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_prob9 to javafx.fxml;
    exports com.example.javafx_prob9;
}