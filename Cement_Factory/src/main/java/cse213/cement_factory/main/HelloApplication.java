package cse213.cement_factory.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/cement_factory/main/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login Cement Factory!");
        stage.setScene(scene);

        stage.show();
    }
}
