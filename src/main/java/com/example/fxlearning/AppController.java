package com.example.fxlearning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class AppController {

    @FXML
    private CheckBox cb1;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb3;

    @FXML
    private CheckBox cb4;

    @FXML
    private Label labelList;

    @FXML
    private Label labelCount;

    public void handleCheckboxEvent(ActionEvent event){
        int count = 0;
        String message = "";

        if(cb1.isSelected()){
            count++;
            message += cb1.getText() + "\n";
        }

        if(cb2.isSelected()){
            count++;
            message += cb2.getText() + "\n";
        }

        if(cb3.isSelected()){
            count++;
            message += cb3.getText() + "\n";
        }

        if(cb4.isSelected()){
            count++;
            message += cb4.getText() + "\n";
        }

        labelList.setText(message);
        labelCount.setText("Selected items : " + count);
    }
}
