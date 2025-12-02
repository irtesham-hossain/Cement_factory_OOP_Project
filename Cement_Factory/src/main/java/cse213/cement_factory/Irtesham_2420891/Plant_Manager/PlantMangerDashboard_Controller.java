package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PlantMangerDashboard_Controller
{
    @javafx.fxml.FXML
    private Button EnterProductionButton;
    @javafx.fxml.FXML
    private Button enterAttendanceButton;
    @javafx.fxml.FXML
    private Button targetProductionButton;
    @javafx.fxml.FXML
    private Button checkAttendanceButton;
    @javafx.fxml.FXML
    private Button shiftEfficiencyButton;
    @javafx.fxml.FXML
    private Button trackRawMatterialButton;
    @javafx.fxml.FXML
    private Button dailyProductionButton;
    @javafx.fxml.FXML
    private Button warehouseStockButton;
    @javafx.fxml.FXML
    private AnchorPane PlantManagerDashboard;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkAttendanceONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/CheckShiftAttendance.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void dailyProductionONA(ActionEvent actionEvent)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/MonitorDailyProduction.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void warehouseStockONA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/MonitorWarehouseStocks.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }
/// /
    @javafx.fxml.FXML
    public void targetProductionONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/EnterTargetProduction.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void enterAttendanceONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Enter Attendance.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
            stage.setTitle("Plant Manager Dashboard");
            stage.setScene(scene);
            stage.show();
    }

    @javafx.fxml.FXML
    public void trackRawMatterialONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/TrackRawMaterialConsumption.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
            stage.setTitle("Plant Manager Dashboard");
            stage.setScene(scene);
            stage.show();
    }

    @javafx.fxml.FXML
    public void shiftEfficiencyONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/TrackShiftWiseEfficiency.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
            stage.setTitle("Plant Manager Dashboard");
            stage.setScene(scene);
            stage.show();

        }

    @javafx.fxml.FXML
    public void EnterProductionONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/EnterDailyProduction.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) PlantManagerDashboard.getScene().getWindow();
            stage.setTitle("Plant Manager Dashboard");
            stage.setScene(scene);
            stage.show();
    }
}