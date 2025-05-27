package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import java.util.List;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public interface IAdministradorServices {
    Administrador autorizarLoginAdministrador(String idAdministrador, String pass);
    List<Transaccion> obtenerTransacciones();
}