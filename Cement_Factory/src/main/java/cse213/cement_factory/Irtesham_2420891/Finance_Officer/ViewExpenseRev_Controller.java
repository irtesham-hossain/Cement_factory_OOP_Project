package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

public class ViewExpenseRev_Controller
{
    @javafx.fxml.FXML
    private AnchorPane showExRevAnchor;
    @javafx.fxml.FXML
    private Button showButton;
    @javafx.fxml.FXML
    private DatePicker MonthDate;
    @javafx.fxml.FXML
    private TableView<monthlySummary> RevExTV;
    @javafx.fxml.FXML
    private TableColumn<monthlySummary,Double> expenseCol;
    @javafx.fxml.FXML
    private TableColumn<monthlySummary,Double> RevenueCol;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
            );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) showExRevAnchor.getScene().getWindow();
            stage.setTitle("Finance Officer Dashboard");
            stage.setScene(scene);
            stage.show();




    }

    @javafx.fxml.FXML
    public void showONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        Double totalExpense=0.0;
        Double totalRevenue=0.0;
        File f = new File("Expense.bin");
        FileInputStream fis =new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        File fR = new File("Revenue.bin");
        FileInputStream fisR =new FileInputStream(fR);
        ObjectInputStream oisR= new ObjectInputStream(fisR);
        while (true){
            Expense expense = (Expense) ois.readObject();
            Revenue revenue = (Revenue) oisR.readObject();
            if (MonthDate.getValue().getMonth()==expense.getExpense_date().getMonth()&&
                    MonthDate.getValue().getYear()==expense.getExpense_date().getYear()){
                totalExpense+=expense.getAmount();
                Info("Rev"+ totalRevenue);
            }
            if (MonthDate.getValue().getMonth()==revenue.getRevmonth().getMonth()&&
                    MonthDate.getValue().getYear()==revenue.getRevmonth().getYear()){
                totalRevenue+=revenue.getRevAMount();
            }

        }

//        Info("Expense"+ totalExpense);
    }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}