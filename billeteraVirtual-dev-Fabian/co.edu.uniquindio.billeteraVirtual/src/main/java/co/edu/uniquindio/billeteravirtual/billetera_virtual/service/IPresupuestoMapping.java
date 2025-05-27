package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.PresupuestoDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;

import java.util.List;

public interface IPresupuestoMapping {
    List<PresupuestoDto> getPresupuestoDto(List<Presupuesto> listaPresupuestos);
    PresupuestoDto presupuestoToPresupuestoDto(Presupuesto presupuesto);
    Presupuesto presupuestoDtoToPresupuesto(PresupuestoDto presupuestoDto);
}