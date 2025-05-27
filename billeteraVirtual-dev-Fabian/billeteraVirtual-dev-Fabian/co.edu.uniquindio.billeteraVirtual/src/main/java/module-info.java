module co.edu.uniquindio.billeteravirtual.billetera_virtual {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.base;
    requires itextpdf;

    opens co.edu.uniquindio.billeteravirtual.billetera_virtual to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual.billetera_virtual;
    opens co.edu.uniquindio.billeteravirtual.billetera_virtual.viewController.usuario to javafx.fxml;
    opens co.edu.uniquindio.billeteravirtual.billetera_virtual.viewController;
    exports co.edu.uniquindio.billeteravirtual.billetera_virtual.viewController;
    opens co.edu.uniquindio.billeteravirtual.billetera_virtual.controller;
    exports co.edu.uniquindio.billeteravirtual.billetera_virtual.controller;
}