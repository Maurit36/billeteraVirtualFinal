package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.creacionales.builder;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Cuenta;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Presupuesto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class CuentaBuilder {
    protected String idCuenta;
    protected String nombreBanco;
    protected String numeroCuenta;
    protected String tipoCuenta;
    protected Usuario usuario;
    protected List<Presupuesto> presupuestos = new ArrayList<>();
    protected Double saldoTotal;

    public CuentaBuilder idCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
        return this;
    }

    public CuentaBuilder nombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        return this;
    }

    public CuentaBuilder numeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public CuentaBuilder tipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        return this;
    }

    public CuentaBuilder usuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public CuentaBuilder presupuestos(List<Presupuesto> presupuestos) {
        this.presupuestos = presupuestos;
        return this;
    }

    public CuentaBuilder saldoTotal(Double saldoTotal) {
        this.saldoTotal = saldoTotal;
        return this;
    }

    public Cuenta build() {
        return new Cuenta(idCuenta, nombreBanco, numeroCuenta, tipoCuenta, usuario, presupuestos, saldoTotal);
    }
}