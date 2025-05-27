package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.dto.UsuarioDto;
import java.util.List;

public interface IModelFactoryService {
    List<UsuarioDto> obtenerUsuarios();
}