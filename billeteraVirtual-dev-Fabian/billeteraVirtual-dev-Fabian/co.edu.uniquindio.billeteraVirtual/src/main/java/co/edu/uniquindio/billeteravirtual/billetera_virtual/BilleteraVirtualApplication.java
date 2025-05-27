package co.edu.uniquindio.billeteravirtual.billetera_virtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BilleteraVirtualApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BilleteraVirtualApplication.class.getResource("BilleteraVirtualApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App Billetera Virtual !!!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}