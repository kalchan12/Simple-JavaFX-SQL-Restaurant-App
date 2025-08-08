



package com.example.login;

// Import necessary JavaFX classes
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Fav_Res class handles favorite restaurant navigation
public class Fav_Res {

    // Method to open the home screen
    public void dish() throws IOException {
        // Load the home.fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
        // Load the FXML into a Parent object
        Parent root =fxmlLoader.load();
        // Create a new Stage (window)
        Stage stage = new Stage();
        // Create a new Scene with the loaded root
        Scene scene = new Scene(root);
        // Set the window title
        stage.setTitle("Login!");
        // Set the scene to the stage
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }

    // Method to go back to the login screen
    public void MouseOnClickedBackward() throws IOException {
        // Load the loginn.fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
        // Load the FXML into a Parent object
        Parent root =fxmlLoader.load();
        // Create a new Stage (window)
        Stage stage = new Stage();
        // Create a new Scene with the loaded root
        Scene scene = new Scene(root);
        // Set the window title
        stage.setTitle("Login!");
        // Set the scene to the stage
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }

}