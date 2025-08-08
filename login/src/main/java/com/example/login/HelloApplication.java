

package com.example.login;

// Import necessary JavaFX classes
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Main application class for JavaFX
public class HelloApplication extends Application {

    // Override the start method, entry point for JavaFX applications
    @Override
    public void start(Stage stage) {

        try {
            // Load the login screen from loginn.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
            // Create a new scene with the loaded FXML, set size to 1000x600
            Scene scene = new Scene(fxmlLoader.load(),1000,600);
            // Set the window title
            stage.setTitle("Login!");
            // Set the scene to the stage
            stage.setScene(scene);
            // Show the stage
            stage.show();

        }
        // Catch and print any exceptions that occur during loading
        catch (Exception e){
            e.printStackTrace();
        }
    }

    // Main method, launches the JavaFX application
    public static void main(String[] args) {
        launch();
    }
}
