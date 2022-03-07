module Chat {
    requires javafx.controls;
    requires javafx.fxml;

    opens Chat to javafx.fxml;
    exports Chat;
}
