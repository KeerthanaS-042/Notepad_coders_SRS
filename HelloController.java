package com.example.login;

import com.example.login.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloController {

    @FXML
    private Button btnid;

    @FXML
    private TextField logintxt;

    @FXML
    private TextField pwdtxt;

    @FXML
    void loginvalidate(ActionEvent event) throws ClassNotFoundException {
        if (!logintxt.getText().isBlank() && !pwdtxt.getText().isBlank()) {
            validateUserLogin();
        }
    }

    public void validateUserLogin() throws ClassNotFoundException {
        DatabaseConnection connect = new DatabaseConnection();
        Connection connectDb = connect.getConnection();

        String verifyLogin = "select count(1) from attendees where username='" + logintxt.getText() + "' and password='" + pwdtxt.getText() + "'";
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
}
