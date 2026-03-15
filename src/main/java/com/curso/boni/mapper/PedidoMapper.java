package com.curso.boni.mapper;

import com.curso.boni.domains.Cliente;
import com.curso.boni.domains.Pedido;
import com.curso.boni.dto.PedidoDTO;
import com.curso.boni.enums.PedidoStatus;

public class PedidoMapper {

    public static Pedido toEntity(PedidoDTO dto) {
        Pedido pedido = new Pedido();

        Cliente cliente = new Cliente();
        cliente.setId(dto.getClienteId());

        pedido.setCliente(cliente);
        pedido.setStatus(PedidoStatus.valueOf(dto.getStatus()));

        return pedido;
    }
}