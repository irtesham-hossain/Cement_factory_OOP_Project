package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class searchOrdersController
{
    @javafx.fxml.FXML
    private TableColumn<Order,String> productTypeTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> quantityTVColumn;
    @javafx.fxml.FXML
    private TableView<Order> tableView;
    @javafx.fxml.FXML
    private AnchorPane searchOrderAnchor;
    @javafx.fxml.FXML
    private TableColumn locationTV;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    @javafx.fxml.FXML
    public void initialize() {

        quantityTVColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        productTypeTVColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
        locationTV.setCellValueFactory(new PropertyValueFactory<>("location"));

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) searchOrderAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void enterOrderIDButtonOnAction(ActionEvent actionEvent) throws IOException {

        FileInputStream fis = new FileInputStream("Order.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                Order order = (Order) ois.readObject();
                tableView.getItems().add(order);
            }
        }catch(Exception e){


        }
    }
}