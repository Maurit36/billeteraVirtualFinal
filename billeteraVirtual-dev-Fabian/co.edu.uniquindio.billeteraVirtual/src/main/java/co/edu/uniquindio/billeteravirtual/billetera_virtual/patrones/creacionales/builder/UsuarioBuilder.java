package co.edu.uniquindio.billeteravirtual.billetera_virtual.patrones.creacionales.builder;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String telefono;
    protected String idUsuario;
    protected String direccion;
    protected double saldoDisponible;
    protected String contrasenaUsuario;



    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public UsuarioBuilder correo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public UsuarioBuilder idUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public UsuarioBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder saldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
        return this;
    }

    public UsuarioBuilder contrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
        return this;
    }

    public Usuario build(){
        return new Usuario(nombre, apellido,correo, telefono, idUsuario, direccion, saldoDisponible, contrasenaUsuario);
    }




}

