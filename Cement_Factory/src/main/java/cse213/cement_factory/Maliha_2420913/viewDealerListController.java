package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class viewDealerListController
{
    @javafx.fxml.FXML
    private TableColumn<Dealer,Integer> phoneTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Dealer,String> dealerNameTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Dealer,Integer> dealerIdTVColumn;
    @javafx.fxml.FXML
    private TableColumn<Dealer,String> addressTVColumn;
    @javafx.fxml.FXML
    private TableView<Dealer> tableView;
    @javafx.fxml.FXML
    private AnchorPane viewDealerListAnchor;

    @javafx.fxml.FXML
    public void initialize() throws IOException, ClassNotFoundException {
        phoneTVColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        dealerNameTVColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dealerIdTVColumn.setCellValueFactory(new PropertyValueFactory<>("userId"));
        addressTVColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        FileInputStream fis = new FileInputStream("addNewDealer.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                Dealer dealer = (Dealer) ois.readObject();
                tableView.getItems().add(dealer);
            }
        }catch(Exception e){

        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                ("/cse213/cement_factory/Maliha_2420913/salesExecutivedashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) viewDealerListAnchor.getScene().getWindow();
        stage.setTitle("Add New Dealer");
        stage.setScene(scene);
        stage.show();
    }
}