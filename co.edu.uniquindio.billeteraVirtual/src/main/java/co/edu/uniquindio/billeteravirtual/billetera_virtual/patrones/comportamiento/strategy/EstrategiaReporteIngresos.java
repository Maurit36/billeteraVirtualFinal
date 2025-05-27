package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.strategy;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.TipoTransaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class EstrategiaReporteIngresos implements EstrategiaEstadistica {

    @Override
    public String getTitulo() {
        return "Ingresos personales";
    }

    @Override
    public List<EstadisticaCategoria> calcular(List<Usuario> usuarios) {
        List<EstadisticaCategoria> resultado = new ArrayList<>();
        Usuario usuario = usuarios.get(0); // Solo se espera uno

        double totalIngresos = usuario.getListaTransacciones().stream()
                .filter(t -> t.getTipoTransaccion() == TipoTransaccion.DEPOSITO)
                .mapToDouble(Transaccion::getMonto)
                .sum();

        resultado.add(new EstadisticaCategoria("Total ingresos", totalIngresos));
        return resultado;
    }
}
