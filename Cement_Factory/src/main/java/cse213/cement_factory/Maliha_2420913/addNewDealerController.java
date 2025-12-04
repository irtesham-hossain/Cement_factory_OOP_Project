package cse213.cement_factory.Maliha_2420913;

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

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) addDealerAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void saveInfoButtonOnAction(ActionEvent actionEvent) throws IOException {
        String name = nameTF.getText();
        String address = addressTF.getText();
        String contact = contactTF.getText();
        File file = new File("AddNewDealer.bin");

        if(file.exists()){
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream obs =new AppendableObjectOutputStream(fos);
            obs.writeObject(new newDealer(name,contact,address));
            Info("Added");
            obs.close();


        }
        else{
            FileOutputStream fos = new FileOutputStream("AddNewDealer.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(new newDealer(name,contact,address));
            Info("Added");
            obs.close();

        }



    }

    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();

}}