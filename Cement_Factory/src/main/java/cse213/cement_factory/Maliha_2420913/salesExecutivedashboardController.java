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
        stage.setTitle("Sales Executive Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewRevenueReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewSalesReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewConfirmedOrdersOnActionButton(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void viewDeliveryStatusOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOrdersOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateInvoiveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendOrderConfirmationButtonOnAction(ActionEvent actionEvent) {
    }
}