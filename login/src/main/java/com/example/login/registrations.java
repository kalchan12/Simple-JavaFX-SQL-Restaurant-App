package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registrations {
    @FXML
    private TextField tf_Fname;

    @FXML
    private TextField tf_Lname;

    @FXML
    private PasswordField PasswordF;

    @FXML
    private TextField tf_Fname2;

    @FXML
    private TextField tf_Fname12;

    @FXML
    private TextField tf_username;


    String FirstName;
    String LastName;
    String Username;
    String Password;
    String Email;
    String Phone_Number;


   @FXML
    void Register(ActionEvent event) throws SQLException {
        FirstName = tf_Fname.getText();
        LastName = tf_Lname.getText();
        Username = tf_username.getText();
        Email = tf_Fname2.getText();
        Phone_Number = tf_Fname12.getText();
        Password = PasswordF.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into Registration values(?,?,?,?,?,?)");
            stmt.setString(1, FirstName);
            stmt.setString(2, LastName);
            stmt.setString(3, Username);
            stmt.setString(4, Password);
            stmt.setString(5, Email);
            stmt.setString(6, Phone_Number );
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

       Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("Success");
       alert.setHeaderText(null);
       alert.setContentText("Sign up successful");
       alert.showAndWait();
            con.close();



    }
    public void Backtologin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }
}