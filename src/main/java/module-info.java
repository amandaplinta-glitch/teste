module com.mycompany.amanda0510 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.amanda0510 to javafx.fxml;
    exports com.mycompany.amanda0510;
}
