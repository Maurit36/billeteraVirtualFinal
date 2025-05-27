package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.TransaccionDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

import java.util.List;

public interface ITransaccionMapping {
    List<TransaccionDto> getTransaccionDto(List<Transaccion> listaTransacciones);
    TransaccionDto transaccionToTransaccionDto(Transaccion transaccion);
    Transaccion transaccionDtoToTransaccion(TransaccionDto transaccionDto);
}