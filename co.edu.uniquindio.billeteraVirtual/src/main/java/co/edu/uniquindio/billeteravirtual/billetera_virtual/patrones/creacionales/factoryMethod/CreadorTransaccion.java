package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.creacionales.factoryMethod;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public interface CreadorTransaccion {
    Transaccion crearTransaccion(DatosTransaccion datos);
}