package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.estructurales.bridge;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.comportamiento.strategy.EstadisticaCategoria;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.comportamiento.strategy.EstrategiaEstadistica;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ReporteEstadisticaGenerica extends Reporte {
    private EstrategiaEstadistica estrategia;
    private List<Usuario> listaUsuarios;

    public ReporteEstadisticaGenerica(EstrategiaEstadistica estrategia, Exportador exportador, List<Usuario> usuarios) {
        super(exportador);                 // BRIDGE
        this.estrategia = estrategia;      // STRATEGY
        this.listaUsuarios = usuarios;
    }

    @Override
    public void generarYExportar(String nombreArchivo) {
        List<EstadisticaCategoria> estadisticas = estrategia.calcular(listaUsuarios);

        List<String[]> contenido = new ArrayList<>();
        contenido.add(new String[]{"Nombre", "Valor"});

        for (EstadisticaCategoria dato : estadisticas) {
            contenido.add(new String[]{dato.getNombre(), String.valueOf(dato.getValor())});
        }

        exportador.exportar(estrategia.getTitulo(), contenido, nombreArchivo);
    }



}
