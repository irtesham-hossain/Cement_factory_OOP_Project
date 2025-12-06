package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class MonitorWarehouseStocks_Controller
{
    @javafx.fxml.FXML
    private Label GypsumLabel;
    @javafx.fxml.FXML
    private AnchorPane StocksAnchor;
    @javafx.fxml.FXML
    private Label LimeStoneLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) StocksAnchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void showONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        GypsumLabel.setText("");
        LimeStoneLabel.setText("");

        FileInputStream fis = new FileInputStream("Stocks.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        StocksDummy SD = (StocksDummy) ois.readObject();
        if (LocalDate.now().isEqual(SD.getStockDate())){
            GypsumLabel.setText(String.valueOf(1000-SD.getGypsum())+"Tons");
            LimeStoneLabel.setText(String.valueOf(1000-SD.getLimeStone())+"Tons");

        }

    }
}