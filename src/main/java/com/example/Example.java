package com.example;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Example extends Application {

    @Override
    public void start(Stage stage) {
        appStage(stage, "/fxml/example.fxml");
    }

    public Stage appStage (Stage stage, String s) {
        Parent root = loadFXML(s);
        stage.setScene(new Scene(root));
        stage.show();
        return stage;
    }

    private AnchorPane loadFXML(String s) {
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(s)));
        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
        }
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

}
