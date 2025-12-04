package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TrackShiftWiseEfficiency_Controller
{
    @javafx.fxml.FXML
    private PieChart EffficiencyPieChart;
    @javafx.fxml.FXML
    private DatePicker EfficientDate;
    @javafx.fxml.FXML
    private Button checkEffciencyButton;
    @javafx.fxml.FXML
    private ComboBox<Integer> shiftNumberCombo;
    ObservableList<PieChart.Data> EffficiencyPieChartData= FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        shiftNumberCombo.getItems().addAll(1,2,3);

    }

    @javafx.fxml.FXML
    public void checkEffciencyONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("ProductionRecord.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProductionRecord TS = (ProductionRecord) ois.readObject();
        if (shiftNumberCombo.getValue()==TS.getShift()){
                int targetPerShift= (TS.getTarget_production()/3);
                if (targetPerShift!=0){
                    EffficiencyPieChartData.add(new PieChart.Data("Amount Produced",(TS.getAmount_produced())/ (TS.getAmount_produced()+targetPerShift)));
                    EffficiencyPieChart.setData(EffficiencyPieChartData);
                }


        }




    }
}