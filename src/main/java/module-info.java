module com.example.sdr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sdr to javafx.fxml;
    exports com.example.sdr;
}