package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.Maliha_2420913.Dealer;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.Objects;

public class ViewDealPaymentHistory_Controller {
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy, Double> paidAmountCol;
    @javafx.fxml.FXML
    private AnchorPane anchor;
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy, String> nameCol;
    @javafx.fxml.FXML
    private TextField DealerNameTF;
    @javafx.fxml.FXML
    private TableView<DealerPaymentDummy> tableView;
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy, LocalDate> paidDateCol;

    @javafx.fxml.FXML
    public void initialize() {
        paidAmountCol.setCellValueFactory(new PropertyValueFactory<>("totalBill"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("dealerName"));
        paidDateCol.setCellValueFactory(new PropertyValueFactory<>("paidDate"));

    }

    @javafx.fxml.FXML
    public void claerONA(ActionEvent actionEvent) {
        tableView.getItems().clear();
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) anchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void showONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        if (DealerNameTF.getText().isEmpty()){
            Info("Dealer Name can be empty");
            return;
        }
        FileInputStream fis = new FileInputStream("DealerPayment.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (true) {
            try {
                DealerPaymentDummy DPD = (DealerPaymentDummy) ois.readObject();

                if (Objects.equals(DPD.getDealerName(), DealerNameTF.getText())&& DPD.isPaid()) {
                    tableView.getItems().add(DPD);
                }
            } catch (EOFException e) {
                break;
            }
        }
    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}