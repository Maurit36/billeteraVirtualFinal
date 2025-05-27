package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.command;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.estructurales.bridge.Exportador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.estructurales.bridge.ReporteService;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.function.BiConsumer;

public class ReporteUsuarioCommand implements Command {

    private final Usuario usuario;
    private final String nombreArchivo;
    private final Exportador exportador;
    private final ReporteService reporteService;
    private final BiConsumer<ReporteService, Usuario> estrategiaMetodo;

    public ReporteUsuarioCommand(
            Usuario usuario,
            String nombreArchivo,
            Exportador exportador,
            BiConsumer<ReporteService, Usuario> estrategiaMetodo
    ) {
        this.usuario = usuario;
        this.nombreArchivo = nombreArchivo;
        this.exportador = exportador;
        this.reporteService = new ReporteService();
        this.estrategiaMetodo = estrategiaMetodo;
    }

    @Override
    public void execute() {
        estrategiaMetodo.accept(reporteService, usuario);
    }
}
