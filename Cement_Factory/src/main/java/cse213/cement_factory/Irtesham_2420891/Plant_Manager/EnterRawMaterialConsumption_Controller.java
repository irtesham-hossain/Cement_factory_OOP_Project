package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class EnterRawMaterialConsumption_Controller
{
    @javafx.fxml.FXML
    private TextField GypsumTF;
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField limeStoneTF;
    @javafx.fxml.FXML
    private AnchorPane anchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddONA(ActionEvent actionEvent) throws IOException {
        if (limeStoneTF.getText().isEmpty()||GypsumTF.getText().isEmpty()){
            Info("ALl Fields Must be Filled");
            return;
        }
        if (date.getValue().isAfter(LocalDate.now())){
            Info("Date Can not be future");
            return;

        }
        StocksDummy SD = new StocksDummy(Integer.parseInt(limeStoneTF.getText()),Integer.parseInt(GypsumTF.getText()),date.getValue());
        File f = new File("Stocks.bin");
        if (f.exists()){
            FileOutputStream fos = new FileOutputStream(f,true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fos);
            obs.writeObject(SD);
            Info("Stocks Updated");
        }
        else {
            FileOutputStream fos = new FileOutputStream("Stocks.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(SD);
            Info("Stocks Updated");

        }
    }

    @javafx.fxml.FXML
    public void BackONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) anchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }
        public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}