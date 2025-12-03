package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;

public class CheckShiftAttendance_Controller
{
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,LocalDate> dateCol;
    @javafx.fxml.FXML
    private Button addTableButton;
    @javafx.fxml.FXML
    private Button claerButton;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,Integer> ShiftNumberCol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,Integer> WorkerPresentCol;
    @javafx.fxml.FXML
    private DatePicker attendance_date;
    @javafx.fxml.FXML
    private ComboBox<Integer> shiftNumberCombo;
    @javafx.fxml.FXML
    private TableView<AttendanceRecord> attendanceTV;
    @javafx.fxml.FXML
    private AnchorPane checkAttendanceAnchor;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecord,Integer> TotalWorkerCol;

    @javafx.fxml.FXML
    public void initialize() {
        shiftNumberCombo.getItems().addAll(1,2,3);
        dateCol.setCellValueFactory(new PropertyValueFactory<>("attendance_date"));
        TotalWorkerCol.setCellValueFactory(new PropertyValueFactory<>("total_worker"));
        WorkerPresentCol.setCellValueFactory(new PropertyValueFactory<>("present_worker"));
        ShiftNumberCol.setCellValueFactory(new PropertyValueFactory<>("shift_number") );


    }

    @javafx.fxml.FXML
    public void addToTableONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {

        if (attendance_date.getValue() == null || shiftNumberCombo.getValue()== null){
            error("ALL Fields Must Be Filled");
            return;
        }
        if (attendance_date.getValue().isAfter(LocalDate.now())){
            error("Date can not be future");
            return;
        }


        attendanceTV.getItems().clear();
        FileInputStream fis = new FileInputStream("Attendance.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(true){
            try {
                AttendanceRecord R = (AttendanceRecord) ois.readObject();
                if (attendance_date.getValue().isEqual(R.getAttendance_date())&& shiftNumberCombo.getValue()==R.getShift_number()) {

                    attendanceTV.getItems().add(R);
                }


            } catch (IOException e) {
                break;
            }

        }


    }

    @javafx.fxml.FXML
    public void BackONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) checkAttendanceAnchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
        attendanceTV.getItems().clear();

    }
    public void error(String s){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setContentText(s);
        alert.showAndWait();
    }
}