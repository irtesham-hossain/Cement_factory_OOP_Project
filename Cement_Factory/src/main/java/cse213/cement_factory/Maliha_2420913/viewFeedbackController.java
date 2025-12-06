package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class viewFeedbackController
{
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private AnchorPane viewFeedbackAnchor;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeCB.getItems().addAll("OPC","PPC","SRC","White Cement");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) viewFeedbackAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void showFeedbackButton(ActionEvent actionEvent) throws IOException {
        if (productTypeCB.getValue() == null){
            Info("select a type");
            return;
        }
        FileInputStream fis = new FileInputStream("Feedback.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                feedBack feedback = (feedBack) ois.readObject();
                outputLabel.setText(feedback.toString());
            }
        }catch(Exception e){


        }

    }

    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();

}}