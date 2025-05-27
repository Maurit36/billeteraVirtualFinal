package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.CuentaDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;
import java.util.List;

public interface ICuentaMapping {
    List<CuentaDto> getCuentaDto(List<Cuenta> listaCuentas);
    CuentaDto cuentaToCuentaDto(Cuenta cuenta);
    Cuenta cuentaDtoToCuenta(CuentaDto cuentaDto);
}