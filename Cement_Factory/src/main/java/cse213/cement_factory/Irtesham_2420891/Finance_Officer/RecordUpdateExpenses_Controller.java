package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;

public class RecordUpdateExpenses_Controller
{
    @javafx.fxml.FXML
    private TextField expenseTypeTF;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private Button addButton;
    @javafx.fxml.FXML
    private DatePicker expenseDate;
    @javafx.fxml.FXML
    private TextField expenseAmountTF;
    @javafx.fxml.FXML
    private AnchorPane RecordExpenseAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addONA(ActionEvent actionEvent) throws IOException {
        if (expenseAmountTF.getText().isEmpty()||expenseTypeTF.getText().isEmpty()||expenseDate.getValue()==null){
            Info("All Field Must be Filled");
            return;
        }
        if (expenseDate.getValue().isAfter(LocalDate.now())){
            Info("Date Can`t be Future");
            return;
        }
        File f = new File("Expense.bin");
        if (f.exists()){
            FileOutputStream fis =new FileOutputStream(f,true);
            ObjectOutputStream obs = new AppendableObjectOutputStream(fis);
            obs.writeObject(new Expense(expenseDate.getValue(),expenseTypeTF.getText(),Double.parseDouble(expenseAmountTF.getText())));
            obs.close();
            Info("Expense Has Been Recorded");
        }
        else{
            FileOutputStream fis =new FileOutputStream("Expense.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fis);
            obs.writeObject(new Expense(expenseDate.getValue(),expenseTypeTF.getText(),Double.parseDouble(expenseAmountTF.getText())));
            obs.close();
            Info("Expense Has Been Recorded");
        }
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) RecordExpenseAnchor.getScene().getWindow();
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