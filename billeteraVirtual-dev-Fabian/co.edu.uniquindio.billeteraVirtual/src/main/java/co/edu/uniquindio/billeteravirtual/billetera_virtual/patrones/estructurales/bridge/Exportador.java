package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.estructurales.bridge;

import java.util.List;

public interface Exportador {
    void exportar(String titulo, List<String[]> filas, String nombreArchivo); // ✅

}
