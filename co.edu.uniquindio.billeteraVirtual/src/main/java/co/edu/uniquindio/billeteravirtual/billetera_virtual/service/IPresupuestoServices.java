package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;

public interface IPresupuestoServices {
    boolean crearPresupuesto(Presupuesto presupuesto);
    boolean eliminarPresupuesto(String idPresupuesto);
    boolean actualizarPresupuesto(Presupuesto presupuesto);
}