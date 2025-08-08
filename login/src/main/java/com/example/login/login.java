














package com.example.login;

// Import necessary JavaFX classes
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

// Import Java IO and SQL classes
import java.io.IOException;
import java.sql.*;

// login class handles user login functionality
public class login {

    // Reference to the username input field in the FXML
    @FXML
    private TextField tx_username;
    // Reference to the password input field in the FXML
    @FXML
    private PasswordField pf_password;

    // Variables to store user input and database values
    String user;
    String pass;
    String username;
    String password;

    // Method to handle login action
    public void login() throws IOException, SQLException {

        // Get the username and password entered by the user
        user=tx_username.getText();
        pass=pf_password.getText();
        // Connect to the MySQL database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");
        // Prepare SQL statement to select username and password
        PreparedStatement stmt = con.prepareStatement("select username,passwords from Registration where username=?");
        // Set the username parameter in the SQL statement
        stmt.setString(1,user);
        // Execute the query
        ResultSet rs=stmt.executeQuery();

        // Check if a user with the given username exists
        if (rs.next()){
            // Get the password from the result set
            password = rs.getString("Passwords");
               // Compare the entered password with the database password
               if (pass.equals(password))
                {
                // If passwords match, load the favorite restaurant screen
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
            // If username not found or password doesn't match, show error alert
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
