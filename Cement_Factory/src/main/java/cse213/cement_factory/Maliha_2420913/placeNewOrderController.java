package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class placeNewOrderController
{
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private AnchorPane placeOrderAnchor;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeCB.getItems().addAll("OPC","PPC","SRC","White Cement");

    }

    @javafx.fxml.FXML
    public void enterbutton(ActionEvent actionEvent) {
       try{
        if(productTypeCB.getValue()== null || Integer.parseInt(quantityTF.getText()) < 0) {
           Info("Enter valid Order details");
           return ;
        }

       Order order = new Order(productTypeCB.getValue(), Integer.parseInt(quantityTF.getText()),locationTF.getText());

       File file = new File("Order.bin");

        if(file.exists()) {
            FileOutputStream fos= new FileOutputStream(file,true);
            ObjectOutputStream obs =new AppendableObjectOutputStream(fos);
            obs.writeObject(order);
            obs.close();
            Info("Order is placed");
        }
        else {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(order);
            obs.close();
            Info("Order is placed");
        }}
        catch (NumberFormatException e) {
               Info("Quantity must be a number!");
           }
        catch (IOException e) {
               Info("Error saving order");
           }
    }



    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) placeOrderAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }

    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();


    }}