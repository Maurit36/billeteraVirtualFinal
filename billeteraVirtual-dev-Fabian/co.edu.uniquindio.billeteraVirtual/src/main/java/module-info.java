module co.edu.uniquindio.billeteravirtual.billetera_virtual {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires javafx.base;
    requires itextpdf;
    requires javafx.graphics;
    requires java.desktop;

    opens co.edu.uniquindio.billeteravirtual.billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.model;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController.usuario to javafx.fxml;

    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;

    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController.usuario.cuentas to javafx.fxml;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.model to javafx.base, javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums to javafx.base, javafx.fxml;
}