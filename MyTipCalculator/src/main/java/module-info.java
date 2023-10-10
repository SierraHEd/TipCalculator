module sierra.mytipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens sierra.mytipcalculator to javafx.fxml;
    exports sierra.mytipcalculator;
}
