module io.dbc.github.hardcashdetective {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.hardcashdetective to javafx.fxml;
    exports io.dbc.github.hardcashdetective;
}