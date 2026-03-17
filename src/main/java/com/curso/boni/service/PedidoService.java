package com.curso.boni.service;

import com.curso.boni.domains.Pedido;
import com.curso.boni.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public List<Pedido> listar() {
        return repository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = repository.findById(id).orElseThrow();

        pedido.setStatus(pedidoAtualizado.getStatus());

        return repository.save(pedido);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}