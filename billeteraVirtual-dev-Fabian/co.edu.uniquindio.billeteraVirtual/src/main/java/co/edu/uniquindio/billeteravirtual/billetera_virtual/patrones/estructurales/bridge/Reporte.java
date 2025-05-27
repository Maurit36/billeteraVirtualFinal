package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.estructurales.bridge;

public abstract class Reporte {
    protected Exportador exportador;
    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void generarYExportar(String nombreArchivo);
}
