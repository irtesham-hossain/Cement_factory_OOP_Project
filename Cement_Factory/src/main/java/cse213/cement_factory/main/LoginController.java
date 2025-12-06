package cse213.cement_factory.main;

import cse213.cement_factory.Irtesham_2420891.Finance_Officer.Finance_Officer;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.Plant_Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class LoginController {
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeCombo;
    @javafx.fxml.FXML
    private AnchorPane loginAnchor;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private Button loginButton;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        new CreateDummyDATA();

        userTypeCombo.getItems().addAll("Plant Manager", "Finance Officer", "Dealer", "Sales Executive", "Logistics Manager", "Warehouse Supervisor", "Marketing Manager", "IT Officer");
    }

    @javafx.fxml.FXML
    public void loginONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        if (userIDTF.getText().isEmpty() || passwordPF.getText().isEmpty() || userTypeCombo.getValue() == null) {
            Info("All Fields Must Be Filled");
            return;
        }
        if (userIDTF.getText().length() > 4 && passwordPF.getText().length() > 4) {
            Info("Id and Pass length should no be more than 4");
            return;

        }
        if (Objects.equals(userTypeCombo.getValue(), "Plant Manager")) {
            FileInputStream fis = new FileInputStream("Plant_Manager.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Plant_Manager PLM = (Plant_Manager) ois.readObject();
            if (PLM.getUserId() == Integer.parseInt(userIDTF.getText()) && Objects.equals(PLM.getPassword(), passwordPF.getText())) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
                );

                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = (Stage) loginAnchor.getScene().getWindow();
                stage.setTitle("Plant Manager Dashboard");
                stage.setScene(scene);
                stage.show();

            } else {
                Info("Error user not found");
            }
        } else if (Objects.equals(userTypeCombo.getValue(), "Finance Officer")) {
            FileInputStream fis = new FileInputStream("FinanceOfficer.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Finance_Officer PLM = (Finance_Officer) ois.readObject();
            if (PLM.getUserId() == Integer.parseInt(userIDTF.getText()) && Objects.equals(PLM.getPassword(), passwordPF.getText())) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
                );

                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = (Stage) loginAnchor.getScene().getWindow();
                stage.setTitle("Plant Manager Dashboard");
                stage.setScene(scene);
                stage.show();
            } else {
                Info("Error user not found");
            }
        } else if (Objects.equals(userTypeCombo.getValue(), "Sales Executive")) {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                    ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) loginAnchor.getScene().getWindow();
            stage.setTitle("Sale Execuitive");
            stage.setScene(scene);
            stage.show();

        } else if ((Objects.equals(userTypeCombo.getValue(), "Dealer"))) {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                    ("/cse213/cement_factory/Maliha_2420913/dealerDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) loginAnchor.getScene().getWindow();
            stage.setTitle("Dealer");
            stage.setScene(scene);
            stage.show();
        }

    }


    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}


