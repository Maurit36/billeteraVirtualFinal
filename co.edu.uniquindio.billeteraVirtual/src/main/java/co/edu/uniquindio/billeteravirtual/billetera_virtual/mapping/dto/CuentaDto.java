package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.dto;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.TipoCuenta;

public record CuentaDto (
        String idCuenta,
        String nombreBanco,
        String numeroCuenta,
        double saldoCuenta,
        TipoCuenta tipoCuenta
){
}