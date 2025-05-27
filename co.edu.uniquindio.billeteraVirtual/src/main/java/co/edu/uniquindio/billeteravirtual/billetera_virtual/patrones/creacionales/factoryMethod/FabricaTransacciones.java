package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.creacionales.factoryMethod;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.TipoTransaccion;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public class FabricaTransacciones {

    public static Transaccion crear(DatosTransaccion datos) {
        CreadorTransaccion creador = obtenerCreador(datos.tipoTransaccion);
        return creador.crearTransaccion(datos);
    }

    private static CreadorTransaccion obtenerCreador(TipoTransaccion tipo) {
        return switch (tipo) {
            case RETIRO -> new CreadorTransaccionRetiro();
            case DEPOSITO -> new CreadorTransaccionDeposito();
            case TRANSFERENCIA -> new CreadorTransaccionTransferencia();
        };
    }
}
