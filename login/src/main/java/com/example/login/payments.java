package com.example.login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class payments {
    @FXML
    private TextField PhoneNumber_tf;
    @FXML
    private TextField Email_TF;

    @FXML
    private TextField FullName_tf;


    String PhoneNumber;
    String Email;
    String FullName;

    @FXML
    void Order_Online(ActionEvent event) throws SQLException {
        PhoneNumber = PhoneNumber_tf.getText();
        Email = Email_TF.getText();
        FullName = FullName_tf.getText();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethiofooddelivery", "root", "root");

        PreparedStatement stmt = con.prepareStatement("insert into Paymentinfo values(?,?,?)");
        stmt.setString(1, PhoneNumber);
        stmt.setString(2, Email);
        stmt.setString(3, FullName);
        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");
        if(! PhoneNumber.isEmpty()&& !Email.isEmpty() && ! FullName.isEmpty()){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Thanks For Ordering Online Via Our App ! Your Order will be deliver to you Shortly");
        alert.showAndWait();
        con.close();
        }
        else {
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

