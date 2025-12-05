package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class viewPaymentHistoryController
{
    @javafx.fxml.FXML
    private AnchorPane viewPaymentAnchor;
    @javafx.fxml.FXML
    private TableView<Payment> tableView;
    @javafx.fxml.FXML
    private TableColumn<Payment,LocalDate> DateTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> totalAmountTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment,String> paymentMethodTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> orderIdTVColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) viewPaymentAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}