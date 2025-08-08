











package com.example.login;

// Import necessary JavaFX classes
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

// Import Java IO and SQL classes
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// registrations class handles user registration process
public class registrations {
    // Reference to the first name input field in the FXML
    @FXML
    private TextField tf_Fname;

    // Reference to the last name input field in the FXML
    @FXML
    private TextField tf_Lname;

    // Reference to the password input field in the FXML
    @FXML
    private PasswordField PasswordF;

    // Reference to the email input field in the FXML
    @FXML
    private TextField tf_Fname2;

    // Reference to the phone number input field in the FXML
    @FXML
    private TextField tf_Fname12;

    // Reference to the username input field in the FXML
    @FXML
    private TextField tf_username;

    // Variables to store user input
    String FirstName;
    String LastName;
    String Username;
    String Password;
    String Email;
    String Phone_Number;

   // Method to handle registration action
   @FXML
    void Register(ActionEvent event) throws SQLException {
        // Get the first name, last name, username, email, phone number, and password entered by the user
        FirstName = tf_Fname.getText();
        LastName = tf_Lname.getText();
        Username = tf_username.getText();
        Email = tf_Fname2.getText();
        Phone_Number = tf_Fname12.getText();
        Password = PasswordF.getText();
        // Connect to the MySQL database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");
        // Prepare SQL statement to insert registration info
        PreparedStatement stmt = con.prepareStatement("insert into Registration values(?,?,?,?,?,?)");
        // Set the first name, last name, username, password, email, and phone number parameters in the SQL statement
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