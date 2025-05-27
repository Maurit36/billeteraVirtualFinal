package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.Mappers;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.CuentaDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.service.ICuentaMapping;

import java.util.ArrayList;
import java.util.List;

public class CuentaMappingImpl implements ICuentaMapping {

    @Override
    public List<CuentaDto> getCuentaDto(List<Cuenta> listaCuentas) {
        if(listaCuentas == null) return null;

        List<CuentaDto> listaCuentasDto = new ArrayList<>(listaCuentas.size());
        for (Cuenta cuenta : listaCuentas) {
            listaCuentasDto.add(cuentaToCuentaDto(cuenta));
        }
        return listaCuentasDto;
    }

    @Override
    public CuentaDto cuentaToCuentaDto(Cuenta cuenta) {
        return new CuentaDto(
                cuenta.getIdCuenta(),
                cuenta.getNombreBanco(),
                cuenta.getNumeroCuenta(),
                cuenta.getTipoCuenta(),
                cuenta.getUsuario().getIdUsuario(),
                cuenta.getSaldoTotal()
        );
    }

    @Override
    public Cuenta cuentaDtoToCuenta(CuentaDto cuentaDto) {
        Usuario usuario = co.edu.uniquindio.billeteravirtual.billeteravirtual.patrones.creacionales.singleton.ModelFactory().buscarUsuarioPorId(cuentaDto.idUsuario());

        return Cuenta.builder()
                .idCuenta(cuentaDto.idCuenta())
                .nombreBanco(cuentaDto.nombreBanco())
                .numeroCuenta(cuentaDto.numeroCuenta())
                .tipoCuenta(cuentaDto.tipoCuenta())
                .usuario(usuario)
                .saldoTotal(cuentaDto.saldoTotal())
                .build();
    }
}