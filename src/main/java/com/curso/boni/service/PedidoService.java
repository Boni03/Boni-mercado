package com.curso.boni.service;

import com.curso.boni.domains.Cliente;
import com.curso.boni.domains.Pedido;
import com.curso.boni.repository.ClienteRepository;
import com.curso.boni.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        Long clienteId = pedido.getCliente().getId();

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com id: " + clienteId));

        pedido.setCliente(cliente);

        return pedidoRepository.save(pedido);
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com id: " + id));

        Long clienteId = pedidoAtualizado.getCliente().getId();

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com id: " + clienteId));

        pedido.setCliente(cliente);
        pedido.setStatus(pedidoAtualizado.getStatus());

        return pedidoRepository.save(pedido);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}