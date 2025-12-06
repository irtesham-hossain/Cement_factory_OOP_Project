package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.Irtesham_2420891.Plant_Manager.ProductionRecord;
import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class updatePersonalInfoController
{
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private AnchorPane updateInfoAnchor;
    @javafx.fxml.FXML
    private Label currentInfoOutputL;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void updateInfoButtonOnAction(ActionEvent actionEvent) throws IOException {
        if(nameTF.getText().isEmpty() || phoneTF.getText().isEmpty() || addressTF.getText().isEmpty()){
            Info("Please enter all information");

        }
        Dealer dealer = new Dealer(
                111,
                "Dealer",
                "1234", (Integer.parseInt(phoneTF.getText())),addressTF.getText(),nameTF.getText()
        );
        File pi = new File("PersonalInfo.bin");
        if (pi.exists()) {
            FileOutputStream fos = new FileOutputStream(pi, true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fos);
            obs.writeObject(dealer);
            obs.close();
            Info("Information is Updated");
        }
        else {
            FileOutputStream fos = new FileOutputStream("PersonalInfo.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(dealer);
            Info("Information is Updated");
            obs.close();
        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) updateInfoAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}