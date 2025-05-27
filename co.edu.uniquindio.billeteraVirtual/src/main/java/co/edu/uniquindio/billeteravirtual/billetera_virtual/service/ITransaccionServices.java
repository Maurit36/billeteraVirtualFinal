package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Transaccion;

public interface ITransaccionServices {
    public boolean agregarTransaccion(Transaccion transaccion);

    boolean crearTransaccion(Transaccion transaccion);
    boolean depositoCuenta(String idCuenta, Double monto, String descripcion, String idCategoria);
    boolean depositoPresupuesto(String idCuenta, String idPresupuesto, Double monto, String descripcion, String idCategoria);
    boolean retirarCuenta(String idCuenta, Double monto, String descripcion, String idCategoria);
    boolean retirarPresupuesto(String idCuenta, String idPresupuesto, Double monto, String descripcion, String idCategoria);
    boolean realizarTransferencia(String idCuentaOrigen, String idCuentaDestino, Double monto, String descripcion, String idCategoria);
}