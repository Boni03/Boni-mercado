package com.curso.boni.mapper;

import com.curso.boni.domains.Pedido;
import com.curso.boni.dto.PedidoDTO;
import com.curso.boni.enums.PedidoStatus;

public class PedidoMapper {

    public static Pedido toEntity(PedidoDTO dto) {

        Pedido pedido = new Pedido();

        pedido.setStatus(PedidoStatus.valueOf(dto.getStatus()));

        return pedido;
    }
}