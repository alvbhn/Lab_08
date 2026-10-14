module com.mycompany.lab_08 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab_08 to javafx.fxml;
    exports com.mycompany.lab_08;
}
