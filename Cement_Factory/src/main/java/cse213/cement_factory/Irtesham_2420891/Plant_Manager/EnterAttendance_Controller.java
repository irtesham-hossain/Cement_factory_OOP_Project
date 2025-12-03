package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.AppendableObjectOutputStream;
import cse213.cement_factory.main.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.AttendanceRecord;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

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
    private Button backButton;
    @javafx.fxml.FXML
    private AnchorPane EnterAttendanceAnchor;

    @javafx.fxml.FXML
    public void initialize() {
        shift_number_combo.getItems().addAll(1,2,3);




    }

    @javafx.fxml.FXML
    public void submitONA(ActionEvent actionEvent) throws IOException {
        if (attendance_date.getValue() == null ||
                shift_number_combo.getValue() == null ||
                worker_total_tf.getText().isEmpty() ||
                worker_present_tf.getText().isEmpty()) {

            Info("Please fill all fields!");
            return;
        }
        if (attendance_date.getValue().isAfter(LocalDate.now())){Info("Date Can`t Be future!");return;}
        if (Integer.parseInt(worker_total_tf.getText())<Integer.parseInt(worker_present_tf.getText())) {Info("Total Worker Can not be less than present worker!");return;}

        File f = new File("Attendance.bin");
        if(f.exists()) {
            FileOutputStream fos= new FileOutputStream(f,true);
            ObjectOutputStream obs =new AppendableObjectOutputStream(fos);
            obs.writeObject(new AttendanceRecord(attendance_date.getValue(),shift_number_combo.getValue(),Integer.parseInt(worker_total_tf.getText()),Integer.parseInt(worker_present_tf.getText())));;
            obs.close();
            Info("Attendance is Recorded");
        }
        else {
            FileOutputStream fos = new FileOutputStream("Attendance.bin");
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(new AttendanceRecord(attendance_date.getValue(), shift_number_combo.getValue(), Integer.parseInt(worker_total_tf.getText()), Integer.parseInt(worker_present_tf.getText())));
            ;
            obs.close();
            Info("Attendance is Recorded");
        }
        }
    public void Info(String s){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(s);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backONA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Plant_Manager/Plant_Manager_dashboard.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) EnterAttendanceAnchor.getScene().getWindow();
        stage.setTitle("Plant Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    }
