package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;

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
    }

    @javafx.fxml.FXML
    public void addToTableONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackONA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearONA(ActionEvent actionEvent) {
    }
}