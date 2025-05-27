package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Categoria;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.enums.NombreCategoria;
import java.util.List;

public interface ICategoriaServices {
    public List<Categoria> getListaCategorias();
    boolean agregarCategoria(NombreCategoria nombreCategoria, String idCategoria, double saldo);
    Categoria obtenerCategoria(String idCategoria);
    boolean eliminarCategoria(String idCategoria);
    boolean actualizarCategoria(NombreCategoria nombreCategoria, String idCategoriaActual,
                                String idCategoria, String telefono);
}