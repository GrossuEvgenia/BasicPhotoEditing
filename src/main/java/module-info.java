module com.example.lr5_kg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lr5_kg to javafx.fxml;
    exports com.example.lr5_kg;
}