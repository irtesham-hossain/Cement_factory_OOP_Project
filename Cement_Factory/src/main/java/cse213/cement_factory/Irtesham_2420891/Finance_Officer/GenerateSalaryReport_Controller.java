package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;

public class GenerateSalaryReport_Controller implements Serializable {
    @javafx.fxml.FXML
    private TableColumn<Staff,Integer> salaryCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> departmentCol;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private Button totalMonthlyButton;
    @javafx.fxml.FXML
    private ComboBox<String> deparmentCombo;
    @javafx.fxml.FXML
    private Button showButton;
    @javafx.fxml.FXML
    private AnchorPane salaryReportAnchor;
    @javafx.fxml.FXML
    private TableView<Staff> salaryTV;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn<Staff,Integer> staffIdCol;
    int totalSalary=0;

    @javafx.fxml.FXML
    public void initialize() {
        deparmentCombo.getItems().addAll("Plant Manager","Finance Officer","Dealer","Sales Executive","Logistics Manager","Warehouse Supervisor","Marketing Manager","IT Officer");
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("staffSalary"));
        staffIdCol.setCellValueFactory(new PropertyValueFactory<>("staffID"));
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/FinanceOfficer_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) salaryReportAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void showONA(ActionEvent actionEvent) throws IOException {
        if (deparmentCombo.getValue()==null){
            Info("Department Cant be Empty");
            return;
        }
        FileInputStream fis = new FileInputStream("SalaryRecord.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true){
            try {

                Staff staff = (Staff) ois.readObject();
                totalSalary=(totalSalary+staff.getStaffSalary());
                if (Objects.equals(deparmentCombo.getValue(), staff.getDepartment())){
                    salaryTV.getItems().addAll(staff);
                }
            } catch (ClassNotFoundException e) {
                break;
            }
        }

    }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
        salaryTV.getItems().clear();
    }

    @javafx.fxml.FXML
    public void totalMonthlyONA(ActionEvent actionEvent) throws IOException {

        try {
            FileInputStream fis = new FileInputStream("SalaryRecord.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Staff staff = (Staff) ois.readObject();
                    totalSalary += staff.getStaffSalary();
                } catch (ClassNotFoundException e) {
                    break;
                }

            }

            ois.close();
        } finally {
            Info("Total Salary Monthly of all Staff= "+totalSalary);

        }


    }
    public void Info(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}