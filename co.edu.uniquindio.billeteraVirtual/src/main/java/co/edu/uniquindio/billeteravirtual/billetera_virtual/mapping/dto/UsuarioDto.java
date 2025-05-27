package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.dto;

public record UsuarioDto(
    String nombre,
    String apellido,
    String idUsuario,
    String correo,
    String contrasena
){
}