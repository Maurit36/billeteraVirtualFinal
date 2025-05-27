package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.creacionales.factoryMethod;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.TipoTransaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public class CreadorTransaccionRetiro implements CreadorTransaccion {
    @Override
    public Transaccion crearTransaccion(DatosTransaccion datos) {
        return new Transaccion(
            datos.idTransaccion,
            datos.CuentaOrigen,
            datos.fechaTransaccion,
            datos.monto,
            datos.descripcion,
            null, // Sin cuenta destino
            TipoTransaccion.RETIRO
        );
    }
}
