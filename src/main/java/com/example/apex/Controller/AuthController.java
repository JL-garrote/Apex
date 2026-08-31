package com.example.apex.Controller;

import com.example.apex.Service.Auth;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class AuthController {

    @FXML
    StackPane rootPane;

    @FXML
    TextField loginEmailField;

    @FXML
    PasswordField loginPasswordField;

    @FXML
    ToggleButton registerTabButton;

    @FXML
    ToggleButton loginTabButton;

    Auth autorizarAcceso = new Auth();

    public AuthController() throws SQLException {
    }

    public void log() {
        try {
            autorizarAcceso.login(loginEmailField.getText(),loginPasswordField.getText());
        } catch (Exception e) {
            System.err.println("Error en el controlador");
        }
    }

    @FXML
    public void cambiarView() throws IOException {
        if(registerTabButton.isSelected()) {
            File fxml = new File("src/main/resources/com/example/apex/register.fxml");

            if(fxml.exists()) {
                System.out.println("El archivo existe");
            } else  {
                System.out.println("no existe");
            }

            String rutaRegister = "/com/example/apex/register.fxml";

            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaRegister));
            Parent root = loader.load();

            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if(loginTabButton.isSelected()){
            String rutaLogin = "/com/example/apex/login.fxml";

            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaLogin));
            Parent root = loader.load();

            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}