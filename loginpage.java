package com.example.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class loginpage extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primarystage) throws IOException {
        stg=primarystage;
        Parent root = FXMLLoader.load((getClass().getResource("login.fxml")));
        primarystage.setTitle("login");
        primarystage.setScene(new Scene(root));

        primarystage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}