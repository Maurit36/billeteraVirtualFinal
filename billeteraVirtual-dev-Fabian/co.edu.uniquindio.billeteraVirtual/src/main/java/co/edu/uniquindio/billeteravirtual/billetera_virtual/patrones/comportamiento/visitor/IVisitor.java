package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.comportamiento.visitor;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public interface IVisitor {
    void visitar(Usuario usuario);
    void visitar(Presupuesto presupuesto);
    void visitar(Transaccion transaccion);
}