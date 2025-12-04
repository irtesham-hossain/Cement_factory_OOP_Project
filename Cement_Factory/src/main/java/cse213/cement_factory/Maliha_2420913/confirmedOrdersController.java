package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class confirmedOrdersController
{
    @javafx.fxml.FXML
    private TableColumn<Order,String> productTypeTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> orderIDTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> totalPriceTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,String> customerNameTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> quantityTVColumn;
    @javafx.fxml.FXML
    private TableView<Order> tableView;
    @javafx.fxml.FXML
    private TableColumn<Order, LocalDate> orderDateTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,String> deliveryStatusTVColumn;
    @javafx.fxml.FXML
    private AnchorPane COAnchor;

    @javafx.fxml.FXML
    public void initialize() {
        orderIDTVColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        orderDateTVColumn.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        quantityTVColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        totalPriceTVColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        customerNameTVColumn.setCellValueFactory(new PropertyValueFactory<>("dealerName"));
        productTypeTVColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
        deliveryStatusTVColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) COAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}