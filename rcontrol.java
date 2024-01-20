package com.example.profile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class rcontrol {
 @FXML
 private Label invalid;
    @FXML
    private Button createbtn;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private TextField username;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void GoTod(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void Gotostrategy(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Gotocourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("cregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoTobeginnercourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("begregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoTooptioncourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("optregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoToentrycourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("entregister.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

