package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class searchPastOrders
{
    @javafx.fxml.FXML
    private TableColumn<Order,String> productTypeTVColumn;
    @javafx.fxml.FXML
    private AnchorPane pastOrdersAnchor;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> quantityTVColumn;
    @javafx.fxml.FXML
    private DatePicker enterDateDP;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> totalAmountTVColumn;
    @javafx.fxml.FXML
    private TableView<Order> TableView;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> orderIdTVColumn;

    @javafx.fxml.FXML
    public void initialize() {

        orderIdTVColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productTypeTVColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
        quantityTVColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        totalAmountTVColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) pastOrdersAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}