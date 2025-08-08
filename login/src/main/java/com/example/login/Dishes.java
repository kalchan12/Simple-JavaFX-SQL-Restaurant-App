





package com.example.login;

// Import necessary JavaFX classes
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Import Java IO and SQL classes
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

// Dishes class handles dish ordering and navigation
public class Dishes {

     // Declare stage, scene, and root for JavaFX window management
     private Stage stage;
     private Scene scene;
     private Parent root;

     // Method to open the payment window
     public void order() throws IOException {
          // Load the payments.fxml file
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payments.fxml"));
          // Load the FXML into a Parent object
          Parent root =(Parent)fxmlLoader.load();
          // Create a new Stage (window)
          Stage stage = new Stage();
          // Create a new Scene with the loaded root
          Scene scene = new Scene(root);
          // Optionally set full screen (commented out)
          //stage.setFullScreen(false);
          // Set the window title
          stage.setTitle("Payment");
          // Set the scene to the stage
          stage.setScene(scene);
          // Show the stage
          stage.show();
     }

     // Method to go back to the favorite restaurant window
     public void MouseOnClickedBackward() throws IOException {
          // Load the fav_res.fxml file
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fav_res.fxml"));
          // Load the FXML into a Parent object
          Parent root =(Parent)fxmlLoader.load();
          // Create a new Stage (window)
          Stage stage = new Stage();
          // Create a new Scene with the loaded root
          Scene scene = new Scene(root);
          // Optionally set full screen (commented out)
          //stage.setFullScreen(false);
          // Set the window title
          stage.setTitle("Fav Restaurant!");
          // Set the scene to the stage
          stage.setScene(scene);
          // Show the stage
          stage.show();
     }

     // Method to open the payment window (duplicate functionality)
     public void Payment() throws IOException {
          // Load the payments.fxml file
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payments.fxml"));
          // Load the FXML into a Parent object
          Parent root =(Parent)fxmlLoader.load();
          // Create a new Stage (window)
          Stage stage = new Stage();
          // Create a new Scene with the loaded root
          Scene scene = new Scene(root);
          // Optionally set full screen (commented out)
          //stage.setFullScreen(false);
          // Set the window title
          stage.setTitle("payment");
          // Set the scene to the stage
          stage.setScene(scene);
          // Show the stage
          stage.show();
     }

}
