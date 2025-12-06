package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

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

public class EnterRevenue_Controller
{
    @javafx.fxml.FXML
    private AnchorPane RevenueAnchor;
    @javafx.fxml.FXML
    private TextField RevenueTF;
    @javafx.fxml.FXML
    private DatePicker monthDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addONA(ActionEvent actionEvent) throws IOException {
        File f= new File("Revenue.bin");
        if (f.exists()){
            FileOutputStream fis= new FileOutputStream(f,true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fis);
            obs.writeObject(new Revenue(monthDP.getValue(),Double.parseDouble(RevenueTF.getText())));
            obs.close();
            Info("Revenue Has Been Recoded");

        }
        else{
            FileOutputStream fis= new FileOutputStream("Revenue.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fis);
            obs.writeObject(new Revenue(monthDP.getValue(),Double.parseDouble(RevenueTF.getText())));
            obs.close();
            Info("Revenue Has Been Recoded");

        }
    }


    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) RevenueAnchor.getScene().getWindow();
            stage.setTitle("Finance Officer Dashboard");
            stage.setScene(scene);
            stage.show();

    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}