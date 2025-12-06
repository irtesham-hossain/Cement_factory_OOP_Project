package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class dealerDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane DealerDashboardAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void makePaymentButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/makePayment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("View Sales Report");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void searchPastOrdersButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/searchPastOrders.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("View Sales Report");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void PlaceNewOrderButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/placeNewOrder.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("PLace new Order");
        stage.setScene(scene);
        stage.show();
    }
    @javafx.fxml.FXML
    public void viewPaymentHistoryButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/viewPaymentHistory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("View Payment History");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void checkAvailableStockButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/productAvailibility.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("Check Stock");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void trackDeliveryPorgressButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/trackDeliveryStatus.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("Track Delivery Status");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updatePersonalInfoButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/updatePersonalInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("Update personal Info");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ProvideFeedbackButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/provideFeedback.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("Provide feedback");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) DealerDashboardAnchor.getScene().getWindow();
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }
}