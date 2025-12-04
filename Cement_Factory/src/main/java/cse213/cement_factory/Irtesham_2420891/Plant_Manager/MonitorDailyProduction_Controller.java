package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Locale;

public class MonitorDailyProduction_Controller
{
    @javafx.fxml.FXML
    private TableColumn<ProductionRecord,Integer> CementBagCol;
    @javafx.fxml.FXML
    private TableColumn<ProductionRecord,Integer> TotalAmountCol;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private TableColumn<ProductionRecord, LocalDate> dateCol;
    @javafx.fxml.FXML
    private Button addTableButton;
    @javafx.fxml.FXML
    private AnchorPane MonitorDailyAnchor;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private DatePicker dailyProductionDate;
    @javafx.fxml.FXML
    private TableView<ProductionRecord> dailyProductionTV;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("production_date"));
        CementBagCol.setCellValueFactory(new PropertyValueFactory<>("cementBag"));
        TotalAmountCol.setCellValueFactory(new PropertyValueFactory<>("amount_produced"));
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) MonitorDailyAnchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();



    }

    @javafx.fxml.FXML
    public void addTableONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        outputLabel.setText("");
        dailyProductionTV.getItems().clear();
        if (dailyProductionDate.getValue()==null||
        dailyProductionDate.getValue().isAfter(LocalDate.now())){
            Info("Date Can not be Empty or Future");
            return;
        }
        FileInputStream fis = new FileInputStream("ProductionRecord.bin");

        ObjectInputStream ois = new ObjectInputStream(fis);
        while(true){
            try {
                ProductionRecord PR = (ProductionRecord) ois.readObject();

                int cementBag = ((PR.getAmount_produced() * 1000) / 50);
                PR.setCementBag(cementBag);
                if (dailyProductionDate.getValue().isEqual(PR.getProduction_date())){
                    if (PR.getShift()==0 && PR.getAmount_produced()==0){
                    outputLabel.setText(PR.getProduction_date()+" Target Amount in Tons= "+PR.getTarget_production());}
                    else {
                        dailyProductionTV.getItems().add(PR);
                    }
                }

            } catch (EOFException e) {
                break;}
            }
        ois.close();
        fis.close();
        }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}