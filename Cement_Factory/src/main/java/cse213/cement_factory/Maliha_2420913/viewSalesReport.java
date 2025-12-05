package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class viewSalesReport
{
    @javafx.fxml.FXML
    private Label totalSalesOutputL;
    @javafx.fxml.FXML
    private TableColumn totalPriceTVColumn;
    @javafx.fxml.FXML
    private TableColumn paymentStatusTVColumn;
    @javafx.fxml.FXML
    private TableColumn dealerNameTVColumn;
    @javafx.fxml.FXML
    private TableColumn quantityTVColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn productIdTVColumn;
    @javafx.fxml.FXML
    private AnchorPane viewSalesReportAnchor;
    @javafx.fxml.FXML
    private TableColumn orderIdTVColumn;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private DatePicker selectDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> selectMonthCB;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeCB.getItems().addAll("Daily","Monthly","Weekly");

    }


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) viewSalesReportAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
   // private ArrayList<Report> salesReport = new ArrayList<>();

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
            String type = reportTypeCB.getValue();

            // First, disable all inputs
            selectDateDP.setDisable(true);
            startDateDP.setDisable(true);
            selectMonthCB.setDisable(true);

            // Enable only the relevant input
            if ("Daily".equals(type)) {
                selectDateDP.setDisable(false);
            } else if ("Weekly".equals(type)) {
                startDateDP.setDisable(false);
            } else if ("Monthly".equals(type)) {
                selectMonthCB.setDisable(false);
            }
        }


        }





