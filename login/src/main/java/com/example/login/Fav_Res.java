package com.example.login;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Fav_Res {

    public void dish() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }
    public void MouseOnClickedBackward() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }


 }