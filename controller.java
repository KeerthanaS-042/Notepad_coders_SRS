package com.example.courses;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class controller {

    @FXML
    private Label bvister;

    @FXML
    private Label evisiter;

    @FXML
    private Label ovisiter;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void GoTobeginnercourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bcourse.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void GoTooptioncourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ocourse.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void GoToentrycourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ecourse.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
