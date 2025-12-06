package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EnterStaffSalary_Controller
{
    @javafx.fxml.FXML
    private Button SubmitSalaryButton;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private AnchorPane staffSalaryAnchor;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCombo;
    @javafx.fxml.FXML
    private TextField staffIDTF;

    @javafx.fxml.FXML
    public void initialize() {
        departmentCombo.getItems().addAll("Plant Manager","Finance Officer","Dealer","Sales Executive","Logistics Manager","Warehouse Supervisor","Marketing Manager","IT Officer");
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) staffSalaryAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }


    @javafx.fxml.FXML
    public void SubmitSalaryONA(ActionEvent actionEvent) throws IOException {


        if (salaryTF.getText().isEmpty()||staffIDTF.getText().isEmpty()){
            Info("All Fields Must be Filled");
            return;
        }

        File file = new File("SalaryRecord.bin");
        if (file.exists()){
            FileOutputStream fos = new FileOutputStream(file,true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fos);
            obs.writeObject(new Staff(Integer.parseInt(staffIDTF.getText()),Integer.parseInt(salaryTF.getText()),departmentCombo.getValue()));
            obs.close();
            Info("Salary Of Staff Recorded");
        }
        else {
            FileOutputStream fos = new FileOutputStream("SalaryRecord.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(new Staff(Integer.parseInt(staffIDTF.getText()),Integer.parseInt(salaryTF.getText()),departmentCombo.getValue()));
            obs.close();
            Info("Salary Of Staff Recorded");
        }


    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }

}
