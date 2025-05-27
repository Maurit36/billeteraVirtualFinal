package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.command;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.estructurales.bridge.Exportador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.estructurales.bridge.ReporteService;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;

public class ReporteCuentaCommand implements Command {

    private final Cuenta cuenta;
    private final String nombreArchivo;
    private final Exportador exportador;
    private final ReporteService reporteService;

    public ReporteCuentaCommand(Cuenta cuenta, String nombreArchivo, Exportador exportador) {
        this.cuenta = cuenta;
        this.nombreArchivo = nombreArchivo;
        this.exportador = exportador;
        this.reporteService = new ReporteService();
    }

    @Override
    public void execute() {
        reporteService.generarReportePorCuenta(cuenta, nombreArchivo, exportador);
    }
}
