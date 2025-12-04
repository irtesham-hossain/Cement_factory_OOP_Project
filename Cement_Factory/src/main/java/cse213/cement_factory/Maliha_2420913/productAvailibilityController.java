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

public class productAvailibilityController
{
    @javafx.fxml.FXML
    private TableColumn productTypeTV;
    @javafx.fxml.FXML
    private TableColumn productNameTV;
    @javafx.fxml.FXML
    private TableColumn availableQuantityTV;
    @javafx.fxml.FXML
    private TableColumn unitPriceTV;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private AnchorPane productAvailibilityAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) productAvailibilityAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}