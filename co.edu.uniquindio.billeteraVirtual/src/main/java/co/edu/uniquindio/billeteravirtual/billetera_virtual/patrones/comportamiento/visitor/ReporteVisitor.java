package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.visitor;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class ReporteVisitor implements IVisitor {
    @Override
    public void visitar(Usuario usuario) {
        System.out.println("Usuario: " + usuario.getIdUsuario() + " | Saldo: $" + usuario.getSaldoDisponible());
    }

    @Override
    public void visitar(Presupuesto presupuesto) {
        System.out.println("Presupuesto: " + presupuesto.getListaCategorias() +
                " | Total: $" + presupuesto.getMontoPresupuesto());
    }

    @Override
    public void visitar(Transaccion transaccion) {
        System.out.println("Transacción: " + transaccion.getDescripcion() + " | Monto: $" + transaccion.getMonto());
    }
}