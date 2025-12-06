package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.Maliha_2420913.Dealer;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TrackPendingFailedDealerPayments_Controller
{
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy,Double> TotalBillCol;
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy,String> nameCol;
    @javafx.fxml.FXML
    private TableView<DealerPaymentDummy> DealerFailedPaymentTV;
    @javafx.fxml.FXML
    private TableColumn<DealerPaymentDummy,Double> amountNotPaidCol;
    @javafx.fxml.FXML
    private AnchorPane anchor;

    @javafx.fxml.FXML
    public void initialize() throws IOException, ClassNotFoundException {
        TotalBillCol.setCellValueFactory(new PropertyValueFactory<>("totalBill"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("dealerName"));
        amountNotPaidCol.setCellValueFactory(new PropertyValueFactory<>("amountNotPaid"));

        FileInputStream fis = new FileInputStream("DealerPayment.bin");
        ObjectInputStream ois =new ObjectInputStream(fis);

        while(true) {
            try {


                DealerPaymentDummy DPD = (DealerPaymentDummy) ois.readObject();
                if (!DPD.isPaid()) {
                    DealerFailedPaymentTV.getItems().add(DPD);
                }
            }catch (EOFException e){
                break;
            }
        }
    }

    @javafx.fxml.FXML
    public void BackONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) anchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }

}