package com.example.apex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static final double BASE_WIDTH = 600.0;
    private static final double BASE_HEIGHT = 563.0;
    private static final double MIN_SCALE = 0.85;
    private static final double MAX_SCALE = 1.4;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, BASE_WIDTH, BASE_HEIGHT);

        Pane tarjeta = (Pane) root.lookup(".panel-login");

        Scale scale = new Scale(1, 1);

        scale.setPivotX(tarjeta.getPrefWidth() / 2);
        scale.setPivotY(tarjeta.getPrefHeight() / 2);
        tarjeta.getTransforms().add(scale);

        Runnable updateScale = () -> {
            double widthFactor = scene.getWidth() / BASE_WIDTH;
            double heightFactor = scene.getHeight() / BASE_HEIGHT;

            double factor = Math.min(widthFactor, heightFactor);

            factor = Math.max(MIN_SCALE, Math.min(MAX_SCALE, factor));

            scale.setX(factor);
            scale.setY(factor);
        };

        scene.widthProperty().addListener((obs, oldVal, newVal) -> updateScale.run());
        scene.heightProperty().addListener((obs, oldVal, newVal) -> updateScale.run());

        stage.setTitle("Apex");
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(563);
        stage.show();
    }
}