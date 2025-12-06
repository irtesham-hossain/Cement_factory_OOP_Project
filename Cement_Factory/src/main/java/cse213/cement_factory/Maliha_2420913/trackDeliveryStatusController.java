package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class trackDeliveryStatusController
{
    @javafx.fxml.FXML
    private TableColumn<Delivery,Integer> orderIDTVColumn;
    @javafx.fxml.FXML
    private TableView<Delivery> tableView;
    @javafx.fxml.FXML
    private TableColumn<Delivery, LocalDate> expectedDeliveryDateTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Delivery, LocalDate> orderDateTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Delivery,String> deliveryStatusTVColumn;
    @javafx.fxml.FXML
    private AnchorPane trackDeliveryAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) trackDeliveryAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}