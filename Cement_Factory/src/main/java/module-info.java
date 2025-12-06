module cse213.cement_factory {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires cse213.cement_factory;


//    opens cse213.cement_factory to javafx.fxml;
//    exports cse213.cement_factory;
    exports cse213.cement_factory.main;
    opens cse213.cement_factory.main to javafx.fxml;
    opens cse213.cement_factory.Irtesham_2420891.Plant_Manager to javafx.fxml;
    exports cse213.cement_factory.Irtesham_2420891.Plant_Manager;
    opens cse213.cement_factory.Irtesham_2420891.Finance_Officer to javafx.fxml;
    exports cse213.cement_factory.Irtesham_2420891.Finance_Officer;
    opens cse213.cement_factory.Maliha_2420913 to javafx.fxml;
    exports cse213.cement_factory.Maliha_2420913;
}