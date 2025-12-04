package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class salesExecutivedashboardController
{
    @javafx.fxml.FXML
    private AnchorPane salesExecutiveDashboard;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addaNewDealerButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Maliha_2420913/addNewDealer.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("Add Dealer");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewSalesReportOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/viewSalesReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("View Sales Report");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void viewConfirmedOrdersOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/confirmedOrders.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("Confirmed Orders");
        stage.setScene(scene);
        stage.show();
    }


    @javafx.fxml.FXML
    public void viewDeliveryStatusOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/viewDeliveryStatus.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("View Delivery Status");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void searchOrdersOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/searchOrders.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("Search Orders");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void GenerateInvoiveButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/generateInvoice.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("Generate Invoice");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void sendOrderConfirmationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/sendOrderConfirmation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("Send Order Confirmation");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewDealerListButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/viewDealerList.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salesExecutiveDashboard.getScene().getWindow();
        stage.setTitle("View Dealer List");
        stage.setScene(scene);
        stage.show();
    }
}