package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;
import java.util.List;

public interface IUsuarioServices {
    public List<Usuario> getListaUsuarios();

    boolean agregarUsuario(String nombre,
                           String apellido,
                           String correo,
                           String telefono,
                           String idUsuario,
                           String direccion);

    Usuario obtenerUsuario(String idUsuario);
    boolean eliminarUsuario(String idUsuario);
    boolean actualizarUsuario(String nombre, String apellido, String correo, String telefono,
                              String idUsuarioActual, String idUsuario, String direccion);
    boolean autorizarLoginUsuario(String idUsuario, String pass);
    boolean actualizarUsuarioPerfil(String nombre, String apellido, String correo, String idUsuarioActual);
    boolean agregarUsuarioRegistro(String nombre, String correo, String idUsuario, String contrasena);
}