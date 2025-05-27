package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.*;

import java.util.List;

public interface IModelFactoryServices {
    List<UsuarioDto> obtenerUsuarios();
    boolean agregarUsuario(UsuarioDto usuarioDto);
    boolean actualizarUsuario(String idUsuario,UsuarioDto usuarioDto);
    boolean eliminarUsuario(UsuarioDto usuarioDto);

    List<CuentaDto> obtenerCuentas();
    List<CuentaDto> obtenerCuentasPorUsuario(String idUsuario);
    boolean agregarCuenta(CuentaDto cuentaDto);
    boolean eliminarCuenta(String idCuenta);
    boolean actualizarCuenta(CuentaDto cuentaDto);

    List<TransaccionDto> obtenerTransacciones();
    List<TransaccionDto> obtenerTransaccionesPorUsuario(String idUsuario);
    List<TransaccionDto> obtenerTransaccionesPorCuenta(String idCuenta);
    boolean agregarTransaccion(TransaccionDto transaccionDto);
    boolean retirarCuenta(String idCuenta, Double monto, String descripcion, String idCategoria);
    boolean retirarPresupuesto(String idCuenta, String idPresupuesto, Double monto, String descripcion, String idCategoria);
    boolean depositoCuenta(String idCuenta, Double monto, String descripcion, String idCategoria);
    boolean depositoPresupuesto(String idCuenta, String idPresupuesto, Double monto, String descripcion, String idCategoria);
    boolean realizarTransferencia(String idCuentaOrigen, String idCuentaDestino, Double monto, String descripcion, String idCategoria);

    List<PresupuestoDto> obtenerPresupuestos();
    List<PresupuestoDto> obtenerPresupuestosPorUsuario(String idUsuario);
    boolean agregarPresupuesto(PresupuestoDto presupuestoDto);
    boolean eliminarPresupuesto(String idPresupuesto);
    boolean actualizarPresupuesto(PresupuestoDto presupuestoDto);

    List<CategoriaDto> obtenerCategorias();
    boolean agregarCategoria(CategoriaDto categoriaDto);
    boolean eliminarCategoria(String idCategoria);
    boolean actualizarCategoria(CategoriaDto categoriaDto);
}