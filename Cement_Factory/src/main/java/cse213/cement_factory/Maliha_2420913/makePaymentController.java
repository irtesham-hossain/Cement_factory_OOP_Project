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

import java.io.*;

public class makePaymentController
{
    @javafx.fxml.FXML
    private AnchorPane makePyamentAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) makePyamentAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void proceedToPayButtonOnAction(ActionEvent actionEvent) {
            File inputFile = new File("orders.bin");
            File tempFile = new File("orders_temp.bin");

            boolean paymentDone = false;

            try (
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile));
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tempFile))
            ) {

                while (true) {
                    Order order = (Order) ois.readObject();
                    if (!paymentDone && !order.isPaid()) {
                        order.setPaid(true);
                        paymentDone = true;
                    }

                    // Write the (updated or untouched) order to new file
                    oos.writeObject(order);
                }

            } catch (Exception e) {
                //
            }

            inputFile.delete();
            tempFile.renameTo(inputFile);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Payment successful!");
        alert.showAndWait();
        }}



