package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceDashboard_Controller
{
    @javafx.fxml.FXML
    private AnchorPane financeAnchor;

    @javafx.fxml.FXML
    public void initialize() {
    }




    @javafx.fxml.FXML
    public void trackFailedDealerPaymentONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/TrackPendingFailedDealerPayments.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }
/// //////
    @javafx.fxml.FXML
    public void generateSalaryReport(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/GenerateSalaryReports.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void EnterStaffSalaryONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/EnterStaffSalary.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void recordExpenseONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/RecordUpdateExpenses.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void ViewExpenseONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/ViewMonthlyExpense.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void ViewDealerPaymentONA(ActionEvent actionEvent)throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/ViewDealerPaymentHistory.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();}


        @javafx.fxml.FXML
    public void financiaReportONA(ActionEvent actionEvent)throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/EnterRevenue.fxml")
        );

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) financeAnchor.getScene().getWindow();
            stage.setTitle("Finance Officer Dashboard");
            stage.setScene(scene);
            stage.show();

        }

    @javafx.fxml.FXML
    public void ExRevReportONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/Irtesham_2420891/Finance_Officer/ViewExpenseRev.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Finance Officer Dashboard");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void signOutONA(ActionEvent actionEvent) throws IOException { FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/main/Login.fxml")
    );

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) financeAnchor.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}