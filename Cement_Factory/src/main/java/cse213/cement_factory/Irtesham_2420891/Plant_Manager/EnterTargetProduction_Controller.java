package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class EnterTargetProduction_Controller
{
    @javafx.fxml.FXML
    private DatePicker target_production_date;
    @javafx.fxml.FXML
    private TextField targetProductionAmount;
    @javafx.fxml.FXML
    private Button updatetargetbutton;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private AnchorPane enterTargetAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updatetargetONA(ActionEvent actionEvent) throws IOException {
        File pr= new File("ProductionRecord.bin");
        int shift=0;
        int amProduced=0;
        LocalDate trDate=target_production_date.getValue();
        if (trDate.isAfter(LocalDate.now())){
            Info("Date Can`t Be Future");
            return;
        }
        if (target_production_date.getValue()==null||
        targetProductionAmount.getText().isEmpty()){
            Info("All Fields Must be Filled");
            return;
        }

        int amount = 0;
        try {
            amount = Integer.parseInt(targetProductionAmount.getText());
        } catch (NumberFormatException e) {
            Info( "Please enter a valid integer amount");
            return;
        }

        if (pr.exists()){
            FileOutputStream fos = new FileOutputStream(pr, true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fos);
            obs.writeObject(new ProductionRecord(trDate,shift,amProduced,Integer.parseInt(targetProductionAmount.getText())));
            obs.close();
            Info("Target Production is Recorded");
        }
        else{
            FileOutputStream fos = new FileOutputStream("ProductionRecord.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(new ProductionRecord(trDate,shift,amProduced,Integer.parseInt(targetProductionAmount.getText())));
            Info("Target Production is Recorded");
            obs.close();
        }

    }

    @javafx.fxml.FXML
    public void backButtonONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) enterTargetAnchor.getScene().getWindow();
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