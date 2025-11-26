module cse213.cement_factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.cement_factory to javafx.fxml;
    exports cse213.cement_factory;
}