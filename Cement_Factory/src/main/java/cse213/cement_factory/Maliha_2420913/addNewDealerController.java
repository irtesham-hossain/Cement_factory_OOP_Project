package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;
import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class addNewDealerController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private AnchorPane addDealerAnchor;

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) addDealerAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveInfoButtonOnAction(ActionEvent actionEvent) throws IOException {
        if ( nameTF.getText().isEmpty() ||  addressTF.getText().isEmpty() || contactTF.getText().isEmpty()){
            Info("Please Enter All Information");
            return;
        }

        Dealer dealer = new Dealer(
                111,
                "Dealer",
                "1234",
                Integer.parseInt(contactTF.getText()),
                addressTF.getText(),
                nameTF.getText()
        );

        File file = new File("AddNewDealer.bin");

        if(file.exists()) {
            FileOutputStream fos= new FileOutputStream(file,true);
            ObjectOutputStream obs =new AppendableObjectOutputStream(fos);
            obs.writeObject(dealer);
            obs.close();
            Info("Dealer added");
        }
        else {
            FileOutputStream fos = new FileOutputStream("AddNewDealer.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(dealer);
            obs.close();
            Info("Dealer added");
        }
    }

    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();

}}