package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.strategy;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.List;

public interface EstrategiaEstadistica {
    String getTitulo();
    List<EstadisticaCategoria> calcular(List<Usuario> usuarios);
}
