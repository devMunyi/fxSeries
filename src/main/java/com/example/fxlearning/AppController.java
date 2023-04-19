package com.example.fxlearning;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class AppController {
    @FXML private Label myLabel;

    @FXML private RadioButton rb1;

    @FXML private RadioButton rb2;

    public void selectRadioBtn(){
        String message = "";

        if(rb1.isSelected()){
            message = rb1.getText();
        } else if (rb2.isSelected()) {
            message = rb2.getText();
        }

        myLabel.setText(message);
    }
}
