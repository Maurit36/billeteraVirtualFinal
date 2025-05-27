package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.Mappers;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.PresupuestoDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Categoria;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PresupuestoMappingImpl implements IPresupuestoMapping {

    @Override
    public List<PresupuestoDto> getPresupuestoDto(List<Presupuesto> listaPresupuestos) {
        if(listaPresupuestos == null) return null;

        List<PresupuestoDto> listaPresupuestosDto = new ArrayList<>(listaPresupuestos.size());
        for (Presupuesto presupuesto : listaPresupuestos) {
            listaPresupuestosDto.add(presupuestoToPresupuestoDto(presupuesto));
        }
        return listaPresupuestosDto;
    }

    @Override
    public PresupuestoDto presupuestoToPresupuestoDto(Presupuesto presupuesto) {
        String idCategoria = presupuesto.getCategoria() != null ?
                presupuesto.getCategoria().getIdCategoria() : "";
        String idUsuario = presupuesto.getUsuario() != null ?
                presupuesto.getUsuario().getIdUsuario() : "";
        String idCuenta = presupuesto.getCuenta() != null ?
                presupuesto.getCuenta().getIdCuenta() : ""; // <-- asegúrate de tener este método

        return new PresupuestoDto(
                presupuesto.getIdPresupuesto(),
                presupuesto.getNombre(),
                String.valueOf(presupuesto.getMontoAsignado()),
                String.valueOf(presupuesto.getMontoGastado()),
                idCategoria,
                idUsuario,
                String.valueOf(presupuesto.getSaldo()),
                idCuenta // <-- aquí
        );
    }

    @Override
    public Presupuesto presupuestoDtoToPresupuesto(PresupuestoDto dto) {
        // CHANGED: Get ModelFactory instance only when needed
        var modelFactory = co.edu.uniquindio.factory.ModelFactory.getInstance();

        Usuario usuario = modelFactory.buscarUsuarioPorId(dto.idUsuario());
        Categoria categoria = !dto.idCategoria().isEmpty() ?
                modelFactory.buscarCategoriaPorId(dto.idCategoria()) : null;
        Cuenta cuenta = !dto.idCuenta().isEmpty() ?
                modelFactory.buscarCuentaPorId(dto.idCuenta()) : null;

        return new Presupuesto(
                dto.idPresupuesto(),
                dto.nombre(),
                Double.parseDouble(dto.montoAsignado()),
                Double.parseDouble(dto.montoGastado()),
                categoria,
                usuario,
                Double.parseDouble(dto.saldo()),
                cuenta
        );
    }
}