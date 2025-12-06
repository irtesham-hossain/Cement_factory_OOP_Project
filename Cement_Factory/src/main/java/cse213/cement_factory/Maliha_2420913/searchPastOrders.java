package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class searchPastOrders
{
    @javafx.fxml.FXML
    private TableColumn<Order,String> productTypeTVColumn;
    @javafx.fxml.FXML
    private AnchorPane pastOrdersAnchor;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> quantityTVColumn;
    @javafx.fxml.FXML
    private TableView<Order> TableView;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> orderIdTVColumn;
    @javafx.fxml.FXML
    private ComboBox<String> ProductTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        ProductTypeCB.getItems().addAll("OPC","PPC","SRC","White Cement");

        orderIdTVColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productTypeTVColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
        quantityTVColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/dealerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) pastOrdersAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }


    @javafx.fxml.FXML
    public void searchButtonOnaction(ActionEvent actionEvent) throws IOException {
        FileInputStream fis = new FileInputStream("Order.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {


            while (true) {
                Order order = (Order) ois.readObject();
                TableView.getItems().add(order);
            }
        }catch(Exception e){


        }

    }
}