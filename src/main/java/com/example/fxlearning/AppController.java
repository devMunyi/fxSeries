package com.example.fxlearning;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class AppController implements Initializable {
    @FXML
    private Slider slider;

    @FXML
    private TextField textField;

    private static final double INITIAL_VALUE = 50;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.setValue(INITIAL_VALUE);
        textField.setText(String.valueOf(INITIAL_VALUE));

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.isEmpty()) {
                try {
                    textField.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
                    textField.setStyle("-fx-background-color: white;"); // Reset the background color
                } catch (Exception e) {
                    textField.setStyle("-fx-background-color: pink;"); // Set the background color to indicate an error
                }
            }
        });

    }
}
