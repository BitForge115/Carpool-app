module com.gajemee {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gajemee to javafx.fxml;
    exports com.gajemee;
}
