package com.example.newdashboard;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


import java.io.IOException;

public class dcontroller {

    @FXML
    private Label courselb;

    @FXML
    private Label cryptolb;

    @FXML
    private Label homelb;

    @FXML
    private Label marketlb;

    @FXML
    private Label strategylb;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML

    public void Gotocourse(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dcourse.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Gotostrategy(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dstrategy.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private WebView tradingViewWebView;

    public void initialize() {
        if (tradingViewWebView != null) {
            String embedCode = "<!-- TradingView Widget BEGIN -->\n" +
                    "<div class=\"tradingview-widget-container\">\n" +
                    "  <div class=\"tradingview-widget-container__widget\"></div>\n" +
                    "  <div class=\"tradingview-widget-copyright\"><a href=\"https://www.tradingview.com/\" rel=\"noopener nofollow\" target=\"_blank\"><span class=\"blue-text\">Track all markets on TradingView</span></a></div>\n" +
                    "  <script type=\"text/javascript\" src=\"https://s3.tradingview.com/external-embedding/embed-widget-forex-cross-rates.js\" async>\n" +
                    "  {\n" +
                    "  \"width\": 770,\n" +
                    "  \"height\": 400,\n" +
                    "  \"currencies\": [\n" +
                    "    \"EUR\",\n" +
                    "    \"USD\",\n" +
                    "    \"JPY\",\n" +
                    "    \"GBP\",\n" +
                    "    \"CHF\",\n" +
                    "    \"AUD\",\n" +
                    "    \"CAD\",\n" +
                    "    \"NZD\"\n" +
                    "  ],\n" +
                    "  \"isTransparent\": false,\n" +
                    "  \"colorTheme\": \"light\",\n" +
                    "  \"locale\": \"en\"\n" +
                    "}\n" +
                    "  </script>\n" +
                    "</div>\n" +
                    "<!-- TradingView Widget END -->";

            tradingViewWebView.getEngine().loadContent(embedCode);
        }
    }
}

