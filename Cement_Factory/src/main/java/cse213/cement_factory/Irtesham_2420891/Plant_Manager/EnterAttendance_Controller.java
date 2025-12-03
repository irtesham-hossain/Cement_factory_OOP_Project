package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EnterAttendance_Controller
{
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private TextField worker_present_tf;
    @javafx.fxml.FXML
    private TextField worker_total_tf;
    @javafx.fxml.FXML
    private ComboBox<Integer> shift_number_combo;
    @javafx.fxml.FXML
    private DatePicker attendance_date;

    @javafx.fxml.FXML
    public void initialize() {
        shift_number_combo.getItems().addAll(1,2,3);


    }

    @javafx.fxml.FXML
    public void submitONA(ActionEvent actionEvent) throws IOException {
        
        AttendanceRecord A =new AttendanceRecord(attendance_date.getValue(),shift_number_combo.getValue(),Integer.parseInt(worker_total_tf.getText()),Integer.parseInt(worker_present_tf.getText()));

        FileOutputStream fos= new FileOutputStream("Attendance.bin");
        ObjectOutputStream obs =new ObjectOutputStream(fos);
        obs.writeObject(A);
        obs.close();
        Info("Attendance is Recorded");
    }
    public void Info(String s){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }
}