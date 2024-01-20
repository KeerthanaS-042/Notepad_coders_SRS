package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.EventObject;


public class control {

    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField password;

    @FXML
    private Label register;

    @FXML
    private TextField user;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label wronglogin;

    @FXML
    void loginvalidate(ActionEvent event) throws ClassNotFoundException {
        if (!user.getText().isBlank() && !password.getText().isBlank()) {
            validateUserLogin();
        }
    }

    public void validateUserLogin() throws ClassNotFoundException {
        DatabaseConnection connect = new DatabaseConnection();
        Connection connectDb = connect.getConnection();

        String verifyLogin = "select count(1) from userlogin where username='" + user.getText() + "' and password='" + password.getText() + "'";
        try {
            Statement statement = connectDb.createStatement();
            ResultSet queryresult = statement.executeQuery(verifyLogin);
            while (queryresult.next()) {

                if (queryresult.getInt(1) == 1) {
                    System.out.println("Login Success");
                } else {
                    System.out.println("Enter correct Username and Password...!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




   public void GoTodashboard(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dlogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void GoToregister(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rlogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void GoTod(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dlogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Gotostrategy(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("slogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Gotocourse(MouseEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("clogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoTobeginnercourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("beglogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoTooptioncourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("optlogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void GoToentrycourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("entlogin.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}




