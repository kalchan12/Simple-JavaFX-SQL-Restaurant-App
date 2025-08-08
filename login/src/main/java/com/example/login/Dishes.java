package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class Dishes {

     private Stage stage;
     private Scene scene;
     private Parent root;
     public void order() throws IOException {
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payments.fxml"));
          Parent root =(Parent)fxmlLoader.load();
          Stage stage = new Stage();
          Scene scene = new Scene(root);
          //stage.setFullScreen(false);
          stage.setTitle("Payment");
          stage.setScene(scene);
          stage.show();
     }
     public void MouseOnClickedBackward() throws IOException {
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fav_res.fxml"));
          Parent root =(Parent)fxmlLoader.load();
          Stage stage = new Stage();
          Scene scene = new Scene(root);
          //stage.setFullScreen(false);
          stage.setTitle("Fav Restaurant!");
          stage.setScene(scene);
          stage.show();
     }
     public void Payment() throws IOException {
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payments.fxml"));
          Parent root =(Parent)fxmlLoader.load();
          Stage stage = new Stage();
          Scene scene = new Scene(root);
          //stage.setFullScreen(false);
          stage.setTitle("payment");
          stage.setScene(scene);
          stage.show();
     }

}
