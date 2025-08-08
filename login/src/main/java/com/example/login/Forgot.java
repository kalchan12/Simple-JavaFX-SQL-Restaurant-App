






package com.example.login;

// Import necessary JavaFX classes
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

// Forgot class manages the 'Forgot Password' functionality
public class Forgot {
    // Reference to the email input field in the FXML
    @FXML
    public TextField Email_text;

    // Method to handle the submit action for password reset
    public void submit () throws IOException {

        // Get the email entered by the user
        String Email = Email_text.getText();
        // Check if the email field is not empty
        if(!Email.isEmpty()){
            // Show success alert if email is provided
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Please Check your Email. We have sent you an so that you can reset your password ");
            alert.showAndWait();

        } else {
            // Show error alert if email field is empty
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill Your Email");
            alert.showAndWait();
        }
    }

    // Method to navigate back to the login screen
    public void Mouseonclickbackward() throws IOException {
        // Load the loginn.fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
        // Load the FXML into a Parent object
        Parent root =(Parent)fxmlLoader.load();
        // Create a new Stage (window)
        Stage stage = new Stage();
        // Create a new Scene with the loaded root
        Scene scene = new Scene(root);
        // Set the scene to the stage
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }
}
