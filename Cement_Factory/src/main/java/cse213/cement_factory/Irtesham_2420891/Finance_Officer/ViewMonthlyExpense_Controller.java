package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;




public class ViewMonthlyExpense_Controller {

    @javafx.fxml.FXML
    private AnchorPane ExpenseSummaryAnchor;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private TableColumn<Expense, LocalDate> DateCol;
    @javafx.fxml.FXML
    private Button showButton;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn<Expense, Double> ExpenseCol;
    @javafx.fxml.FXML
    private TableView<Expense> ExpneseSummaryTV;
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private DatePicker toDate;

    @javafx.fxml.FXML
    public void initialize() {
        DateCol.setCellValueFactory(new PropertyValueFactory<>("expense_date"));
        ExpenseCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
//


    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ExpenseSummaryAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @Deprecated


    @javafx.fxml.FXML
    public void showONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        if (fromDate.getValue()==null||toDate.getValue()==null){
            Info("All Fields Must be Filled ");
            return;
        }
        FileInputStream fis = new FileInputStream("Expense.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                Expense expense = (Expense) ois.readObject();

                if (expense.getExpense_date().isAfter(fromDate.getValue()) && expense.getExpense_date().isBefore(toDate.getValue())) {
                    ExpneseSummaryTV.getItems().addAll(expense);


                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @javafx.fxml.FXML
    public void clearONA (ActionEvent actionEvent){
        ExpneseSummaryTV.getItems().clear();

    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}