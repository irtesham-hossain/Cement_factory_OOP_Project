package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<AttendanceRecord,Integer> WorkerAbsentCol;
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
    public void initialize() {
        shiftNumberCombo.getItems().addAll(1,2,3);
        dateCol.setCellValueFactory(new PropertyValueFactory<>("attendance_date"));
        WorkerAbsentCol.setCellValueFactory(new PropertyValueFactory<>("total_worker"));
        WorkerPresentCol.setCellValueFactory(new PropertyValueFactory<>("present_worker"));
        ShiftNumberCol.setCellValueFactory(new PropertyValueFactory<>("shift_number") );


    }

    @javafx.fxml.FXML
    public void addToTableONA(ActionEvent actionEvent) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("Attendance.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(true){
            try {
                AttendanceRecord R = (AttendanceRecord) ois.readObject();
                attendanceTV.getItems().add(R);


            } catch (IOException e) {
                break;
            }

        }


    }

    @javafx.fxml.FXML
    public void BackONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
    }
}