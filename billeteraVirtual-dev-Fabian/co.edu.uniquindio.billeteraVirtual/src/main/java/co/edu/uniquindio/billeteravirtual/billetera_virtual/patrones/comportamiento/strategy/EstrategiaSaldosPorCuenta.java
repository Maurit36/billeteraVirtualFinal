package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.strategy;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class EstrategiaSaldosPorCuenta implements EstrategiaEstadistica{
    @Override
    public String getTitulo() {
        return "Saldos por cuenta";
    }

    @Override
    public List<EstadisticaCategoria> calcular(List<Usuario> usuarios) {
        List<EstadisticaCategoria> resultado = new ArrayList<>();

        Usuario usuario = usuarios.get(0); // Solo se espera un usuario

        for (Cuenta cuenta : usuario.getListaCuentas()) {
            if (cuenta.getPresupuesto() != null) {
                double saldo = cuenta.getPresupuesto().getMontoPresupuesto()
                        - cuenta.getPresupuesto().getMontoPresupuestoGastado();
                resultado.add(new EstadisticaCategoria("Cuenta " + cuenta.getNumeroCuenta(), saldo));
            }
        }

        return resultado;
    }
}
