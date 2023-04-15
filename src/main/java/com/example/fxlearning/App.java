package com.example.fxlearning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("app.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Using FX Checkboxes");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
