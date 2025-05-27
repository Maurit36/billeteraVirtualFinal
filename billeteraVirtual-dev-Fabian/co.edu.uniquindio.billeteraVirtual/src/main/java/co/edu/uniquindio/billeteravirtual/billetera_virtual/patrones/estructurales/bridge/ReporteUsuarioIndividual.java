package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.estructurales.bridge;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.comportamiento.strategy.EstadisticaCategoria;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.comportamiento.strategy.EstrategiaEstadistica;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ReporteUsuarioIndividual extends Reporte {

    private final Usuario usuario;
    private final EstrategiaEstadistica estrategia;

    public ReporteUsuarioIndividual(Usuario usuario, EstrategiaEstadistica estrategia, Exportador exportador) {
        super(exportador);
        this.usuario = usuario;
        this.estrategia = estrategia;
    }

    @Override
    public void generarYExportar(String nombreArchivo) {
        List<Usuario> listaUsuario = List.of(usuario);
        List<EstadisticaCategoria> datos = estrategia.calcular(listaUsuario);

        List<String[]> filas = new ArrayList<>();

        // ✅ Encabezado
        filas.add(new String[]{"Categoría", "Valor"});

        for (EstadisticaCategoria dato : datos) {
            filas.add(new String[]{dato.getNombre(), String.format("%.2f", dato.getValor())});
        }

        exportador.exportar(estrategia.getTitulo(), filas, nombreArchivo);
    }


}
