package com.example.profile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class register extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primarystage) throws IOException {
        stg=primarystage;
        Parent root = FXMLLoader.load((getClass().getResource("register.fxml")));
        primarystage.setTitle("login");
        primarystage.setScene(new Scene(root));
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}