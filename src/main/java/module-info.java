module io.dbc.github.hardcashdetective {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.hardcashdetective to javafx.fxml;
    exports io.dbc.github.hardcashdetective;
}