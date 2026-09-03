package com.example.apex.Controller;

import com.example.apex.Service.Auth;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class AuthController {

    @FXML
    PasswordField passfield;

    @FXML
    TextField emailfield;

    @FXML
    Button botonRegistro;

    Auth autorizarAcceso = new Auth();

    public AuthController() throws SQLException {
    }

    public void log() {
        try {
            autorizarAcceso.login(emailfield.getText(),passfield.getText());
        } catch (Exception e) {
            System.err.println("Error en el controlador " + e.getMessage());
        }
    }

    public void registro() {

    }

    @FXML
    public void cambiarView() throws IOException {
        String rutaRegister = "/com/example/apex/register.fxml";
        File fxml = new File(rutaRegister);

        if(fxml.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaRegister));
        Parent root = loader.load();

        Stage stage = (Stage) botonRegistro.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}