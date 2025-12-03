package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.ProductionRecord;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;


public class EnterDailyProduction_Controller {
    @javafx.fxml.FXML
    private Button AddProductionButton;
    @javafx.fxml.FXML
    private TextField ProducedAmountTF;
    @javafx.fxml.FXML
    private DatePicker productionDate;
    @javafx.fxml.FXML
    private RadioButton shift_1;
    @javafx.fxml.FXML
    private RadioButton shift_2;
    @javafx.fxml.FXML
    private RadioButton shift_3;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddProductionONA(ActionEvent actionEvent) throws IOException {
        int shift_number = 0;
        int selected_count = 0;

        if (shift_1.isSelected()) {
            selected_count++;
            shift_number = 1;
        }
        if (shift_2.isSelected()) {
            selected_count++;
            shift_number = 2;
        }
        if (shift_3.isSelected()) {
            selected_count++;
            shift_number = 3;
        }


        if (selected_count > 1) {
            Info("Please select ONLY ONE shift!");
            return;
        }

        if (selected_count == 0) {
            Info("Please select a shift!");
            return;
        }
        if (ProducedAmountTF.getText().isEmpty()
        ||productionDate.getValue()==null){
            Info("All Fields should be Filled");
            return;
        }
        if (productionDate.getValue().isAfter(LocalDate.now())){
            Info("Date can not be future");
            return;
        }


        File pr = new File("ProductionRecord.bin");
        if (pr.exists()) {
            FileOutputStream fos = new FileOutputStream(pr, true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fos);
            obs.writeObject(new ProductionRecord(productionDate.getValue(), shift_number, Integer.parseInt(ProducedAmountTF.getText()), 0));
            obs.close();
            Info("Production is Recorded");
        }
        else {
            FileOutputStream fos = new FileOutputStream("ProductionRecord.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(new ProductionRecord (productionDate.getValue(), shift_number, Integer.parseInt(ProducedAmountTF.getText()), 0));
            Info("Attendance is Recorded");
            obs.close();
        }
    }

    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}
