package com.example.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("IAS Computer");
        primaryStage.setScene(new Scene(root, 900, 800));
        
        primaryStage.getScene().getStylesheets().add(getClass().getResource("/stylesMB.css").toExternalForm());
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}