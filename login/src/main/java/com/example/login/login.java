package com.example.login;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


public class login {

    @FXML
    private TextField tx_username;
    @FXML
    private PasswordField pf_password;

       String user;
       String pass;
       String username;
       String password;

    public void login() throws IOException, SQLException {

        user=tx_username.getText();
        pass=pf_password.getText();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");
        PreparedStatement stmt = con.prepareStatement("select username,passwords from Registration where username=?");
        stmt.setString(1,user);
        ResultSet rs=stmt.executeQuery();



        if (rs.next()){
            password = rs.getString("Passwords");
               if (pass.equals(password))
                {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fav_res.fxml"));
                Parent root =fxmlLoader.load();
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setTitle("Fav Restaurant!");
                stage.setScene(scene);
                stage.show();
                }
        }
        else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid password");
            alert.showAndWait();
        }


    }


    public void signup() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registrations.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();

    }
    public void ForgotPass() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Forgot.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }


}
