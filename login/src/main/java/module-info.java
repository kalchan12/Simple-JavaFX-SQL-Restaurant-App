module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;


    opens com.example.login to javafx.fxml;
    exports com.example.login;
}