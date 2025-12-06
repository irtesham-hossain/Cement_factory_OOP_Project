package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

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
    private Label outputLabel;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private AnchorPane TSWEanchor;

    @javafx.fxml.FXML
    public void initialize() {
        shiftNumberCombo.getItems().addAll(1,2,3);


    }

    @javafx.fxml.FXML
    public void checkEffciencyONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("ProductionRecord.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProductionRecord matchedTarget = null;
        ProductionRecord matchedProduction = null;


        try {
            while (true) {
                ProductionRecord pr = (ProductionRecord) ois.readObject();


                if (pr.getProduction_date().isEqual(EfficientDate.getValue())
                        && pr.getTarget_production() != 0) {
                    matchedTarget = pr;
                }


                if (pr.getProduction_date().isEqual(EfficientDate.getValue())
                        && pr.getShift() == shiftNumberCombo.getValue()) {
                    matchedProduction = pr;
                }
            }
        } catch (EOFException e) {



        ois.close();
        fis.close();


        if (matchedTarget == null) {
            Info("No target found for selected date");
            return;
        }

        if (matchedProduction == null) {
            Info("No production record found for selected shift on this date");
            return;
        }


        int target = matchedTarget.getTarget_production() / 3;
        int produced = matchedProduction.getAmount_produced();
        double efficiency = (produced * 100.0) / target;
        outputLabel.setText("Efficiency: " + String.format("%.2f", efficiency) + "%");

        int remaining = target - produced;
        if (remaining < 0) remaining = 0;

        EffficiencyPieChartData.clear();
        EffficiencyPieChartData.add(new PieChart.Data("Amount Produced", produced));
        EffficiencyPieChartData.add(new PieChart.Data("Remaining Target", remaining));

        EffficiencyPieChart.setData(EffficiencyPieChartData);
    }



    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) TSWEanchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}




