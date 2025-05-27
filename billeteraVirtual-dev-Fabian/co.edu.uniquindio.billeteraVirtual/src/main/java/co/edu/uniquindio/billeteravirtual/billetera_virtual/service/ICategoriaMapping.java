package co.edu.uniquindio.billeteravirtual.billetera_virtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.CategoriaDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Categoria;

import java.util.List;

public interface ICategoriaMapping {
    List<CategoriaDto> getCategoriaDto(List<Categoria> listaCategorias);
    CategoriaDto categoriaToCategoriaDto(Categoria categoria);
    Categoria categoriaDtoToCategoria(CategoriaDto categoriaDto);
}
