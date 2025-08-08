






package com.example.login;

// Import necessary JavaFX classes
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

// Import Java IO and SQL classes
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// payments class handles payment information and online order processing
public class payments {
    // Reference to the phone number input field in the FXML
    @FXML
    private TextField PhoneNumber_tf;
    // Reference to the email input field in the FXML
    @FXML
    private TextField Email_TF;

    // Reference to the full name input field in the FXML
    @FXML
    private TextField FullName_tf;

    // Variables to store user input
    String PhoneNumber;
    String Email;
    String FullName;

    // Method to handle online order action
    @FXML
    void Order_Online(ActionEvent event) throws SQLException {
        // Get the phone number, email, and full name entered by the user
        PhoneNumber = PhoneNumber_tf.getText();
        Email = Email_TF.getText();
        FullName = FullName_tf.getText();
        // Connect to the MySQL database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");

        // Prepare SQL statement to insert payment info
        PreparedStatement stmt = con.prepareStatement("insert into Paymentinfo values(?,?,?)");
        // Set the phone number, email, and full name parameters in the SQL statement
        stmt.setString(1, PhoneNumber);
        stmt.setString(2, Email);
        stmt.setString(3, FullName);
        // Execute the update and get the number of records inserted
        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");
        // Check if all fields are filled
        if(! PhoneNumber.isEmpty()&& !Email.isEmpty() && ! FullName.isEmpty()){
        // Show success alert if all fields are filled
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Thanks For Ordering Online Via Our App ! Your Order will be deliver to you Shortly");
        alert.showAndWait();
        con.close();
        }
        else {
            // Show invalid alert if any field is empty
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill the form");
            alert.showAndWait();
            con.close();
        }
    }

    public void OrderWithCash()  {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Thanks For Ordering Via Our App ! Your Order will be deliver to you Shortly");
            alert.showAndWait();



    }
    public void logout() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginn.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Mouseonclickbackward() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root =fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

