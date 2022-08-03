module com.jordan.chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.jordan.chess.gui to javafx.fxml;
    exports com.jordan.chess.gui;
}