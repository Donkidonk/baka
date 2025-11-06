module org.example.baka {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.baka to javafx.fxml;
    exports org.example.baka;
}