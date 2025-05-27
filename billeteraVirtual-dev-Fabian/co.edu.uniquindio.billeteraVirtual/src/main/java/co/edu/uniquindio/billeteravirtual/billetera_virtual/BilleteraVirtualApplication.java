package co.edu.uniquindio.billeteravirtual.billetera_virtual;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.utils.DataUtil;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class BilleteraVirtualApplication extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        DataUtil.inicializarDatos();
        this.primaryStage = stage;
        this.primaryStage.setTitle("Billetera Virtual");

        showPrimaryView();
    }

    public void showPrimaryView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicial.fxml"));
        Pane root = loader.load();

        InicialViewController controller = loader.getController();
        controller.setApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallLoginAdmin(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginAdministrador.fxml"));
        Pane root = loader.load();

        LoginAdminViewController controller = loader.getController();
        controller.setApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallLoginUsuario(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginUsuario.fxml"));
        Pane root = loader.load();

        LoginUsuarioViewController controller = loader.getController();
        controller.setApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallPrimary(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Pane root = loader.load();

        PrimaryViewController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallRegistro(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("registro.fxml"));
        Pane root = loader.load();

        RegistroViewController controller = loader.getController();

        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallRegresar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicial.fxml"));
        Pane root = loader.load();

        InicialViewController controller = loader.getController();

        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onRegresarInicial(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicial.fxml"));
        Pane root = loader.load();
        InicialViewController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallVentanaPrincipal(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicial.fxml"));
        Pane root = loader.load();
        InicialViewController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallVentanaPrincipalAdm(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicial.fxml"));
        Pane root = loader.load();
        InicialViewController controller = loader.getController();
        controller.setApp(this);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallUsuarioVentanaPrincipal(ActionEvent event, Usuario usuario) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("usuarioVentanaPrincipal.fxml"));
        Pane root = loader.load();
        UsuarioVentanaPrincipalViewController controller = loader.getController();
        controller.setApp(this);
        controller.setUsuarioLogueado(usuario);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onCallAdministradorVentanaPrincipal(ActionEvent e,
                                                    Administrador administrador) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("administradorVentanaPrincipal.fxml"));
        Pane root = loader.load();
        URL rutaGC = getClass().getResource("adminFolder/gestionCuentas.fxml");

        if (rutaGC == null) throw new IllegalStateException("No se encontró gestionCuentas.fxml");

        AdministradorVentanaPrincipalViewController c = loader.getController();
        c.setApp(this);
        c.setAdministradorLogueado(administrador);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}