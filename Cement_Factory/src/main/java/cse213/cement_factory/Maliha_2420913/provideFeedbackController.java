package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

public class provideFeedbackController
{
    @javafx.fxml.FXML
    private TextArea yourFeedbackTA;
    @javafx.fxml.FXML
    private AnchorPane feedbackAnchor;
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private RadioButton avgbutton;
    @javafx.fxml.FXML
    private RadioButton poorButton;
    @javafx.fxml.FXML
    private RadioButton goodButton;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeCB.getItems().addAll("OPC","PPC","SRC","White Cement");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/dealerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) feedbackAnchor.getScene().getWindow();
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void submitFeedbackButton(ActionEvent actionEvent) throws IOException {
        if (productTypeCB.getValue() == null){
            Info("select a type");
            return;
        }
        if (goodButton.isSelected() && avgbutton.isSelected() || goodButton.isSelected() && poorButton.isSelected()
        || avgbutton.isSelected() && poorButton.isSelected()){
            Info("Select one rating");
        }
        feedBack feedback = new feedBack("Dealer", productTypeCB.getValue(),yourFeedbackTA.getText());
        File file = new File("Feedback.bin");

        if(file.exists()) {
            FileOutputStream fos= new FileOutputStream(file,true);
            ObjectOutputStream obs =new AppendableObjectOutputStream(fos);
            obs.writeObject(feedback);
            obs.close();
            Info("feedback added");
        }
        else {
            FileOutputStream fos = new FileOutputStream("Feedback.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(feedback);
            obs.close();
            Info("feedback added");
        }}

        public void Info(String s) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(s);
            alert.showAndWait();
    }

}