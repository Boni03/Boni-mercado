package com.curso.boni.mapper;

import com.curso.boni.domains.Categoria;
import com.curso.boni.dto.CategoriaDTO;

public class CategoriaMapper {

    public static Categoria toEntity(CategoriaDTO dto) {
        Categoria categoria = new Categoria();

        categoria.setNome(dto.getNome());

        return categoria;
    }
}