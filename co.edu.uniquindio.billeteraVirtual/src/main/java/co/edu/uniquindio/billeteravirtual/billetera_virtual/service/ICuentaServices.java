package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.TipoCuenta;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public interface ICuentaServices {
    boolean agregarCuenta(String idCuenta, String nombreBanco, String numeroCuenta, TipoCuenta tipoCuenta,
                          Usuario usuarioAsociado, Administrador administradorAsociado);
    boolean actualizarCuenta(String idCuenta, String idCuentaActual, String nombreBanco, String numeroCuenta,
                             TipoCuenta tipoCuenta, Usuario usuarioAsociado, Administrador administradorAsociado);
    boolean eliminarCuenta(String idCuenta, String nombreBanco, String numeroCuenta, TipoCuenta tipoCuenta);
}