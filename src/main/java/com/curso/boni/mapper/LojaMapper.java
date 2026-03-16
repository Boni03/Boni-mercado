package com.curso.boni.mapper;

import com.curso.boni.domains.Loja;
import com.curso.boni.dto.LojaDTO;
import com.curso.boni.enums.LojaStatus;

public class LojaMapper {

    public static Loja toEntity(LojaDTO dto) {
        Loja loja = new Loja();

        loja.setNome(dto.getNome());
        loja.setEndereco(dto.getEndereco());
        loja.setStatus(LojaStatus.valueOf(dto.getStatus()));

        return loja;
    }
}