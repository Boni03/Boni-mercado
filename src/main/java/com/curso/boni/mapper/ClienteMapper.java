package com.curso.boni.mapper;

import com.curso.boni.domains.Cliente;
import com.curso.boni.dto.ClienteDTO;

public class ClienteMapper {

    private ClienteMapper() {
    }

    public static Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }
}
