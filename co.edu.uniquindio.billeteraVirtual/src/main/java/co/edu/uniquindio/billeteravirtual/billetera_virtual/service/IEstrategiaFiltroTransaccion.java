package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public interface IEstrategiaFiltroTransaccion {
    boolean aplicar(Transaccion transaccion);
}