module com.example.programtech_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programtech_javafx to javafx.fxml;
    exports com.example.programtech_javafx;
}