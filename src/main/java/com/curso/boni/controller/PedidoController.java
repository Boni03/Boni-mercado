package com.curso.boni.controller;

import com.curso.boni.domains.Pedido;
import com.curso.boni.dto.PedidoDTO;
import com.curso.boni.mapper.PedidoMapper;
import com.curso.boni.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    @PostMapping
    public Pedido criar(@RequestBody PedidoDTO dto) {
        Pedido pedido = PedidoMapper.toEntity(dto);
        return service.salvar(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizar(@PathVariable Long id, @RequestBody PedidoDTO dto) {
        Pedido pedido = PedidoMapper.toEntity(dto);
        return service.atualizar(id, pedido);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}