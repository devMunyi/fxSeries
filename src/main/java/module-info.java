module com.example.fxlearning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlearning to javafx.fxml;
    exports com.example.fxlearning;
}