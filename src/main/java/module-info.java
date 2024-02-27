module com.example.gametwod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gametwod to javafx.fxml;
    exports com.example.gametwod;
}