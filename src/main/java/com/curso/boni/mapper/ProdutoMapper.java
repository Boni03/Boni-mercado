package com.curso.boni.mapper;

import com.curso.boni.domains.Produto;
import com.curso.boni.dto.ProdutoDTO;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();

        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());

        return produto;
    }
}