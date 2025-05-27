package co.edu.uniquindio.billeteravirtual.billetera_virtual.mapping.Mappers;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.CategoriaDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Categoria;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.service.ICategoriaMapping;

import java.util.ArrayList;
import java.util.List;

public class CategoriaMappingImpl implements ICategoriaMapping {
    @Override
    public List<CategoriaDto> getCategoriaDto(List<Categoria> listaCategorias) {
        if(listaCategorias == null) return null;

        List<CategoriaDto> listaCategoriasDto = new ArrayList<>(listaCategorias.size());
        for (Categoria categoria : listaCategorias) {
            listaCategoriasDto.add(categoriaToCategoriaDto(categoria));
        }
        return listaCategoriasDto;
    }

    @Override
    public CategoriaDto categoriaToCategoriaDto(Categoria categoria) {
        return new CategoriaDto(
                categoria.getIdCategoria(),
                categoria.getNombre(),
                categoria.getDescripcion()
        );
    }

    @Override
    public Categoria categoriaDtoToCategoria(CategoriaDto categoriaDto) {
        return new Categoria(
                categoriaDto.idCategoria(),
                categoriaDto.nombre(),
                categoriaDto.descripcion()
        );
    }
}