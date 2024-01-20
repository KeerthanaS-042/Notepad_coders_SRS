package com.example.strategy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class scontroller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}