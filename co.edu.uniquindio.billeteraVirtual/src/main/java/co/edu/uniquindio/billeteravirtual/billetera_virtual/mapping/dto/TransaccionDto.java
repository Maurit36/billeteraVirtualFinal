package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.dto;

public record TransaccionDto(String idTransaccion,
                             String fecha,
                             String tipoTransaccion,
                             String monto,
                             String descripcion,
                             String idCuentaOrigen,
                             String idCuentaDestino,
                             String idCategoria) {
}