module com.example.customcontrols_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customcontrols_javafx to javafx.fxml;
    exports com.example.customcontrols_javafx;
}