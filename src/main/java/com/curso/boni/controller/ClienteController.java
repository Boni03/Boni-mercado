package com.curso.boni.controller;

import com.curso.boni.domains.Cliente;
import com.curso.boni.dto.ClienteDTO;
import com.curso.boni.mapper.ClienteMapper;
import com.curso.boni.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente criar(@RequestBody ClienteDTO dto) {
        Cliente cliente = ClienteMapper.toEntity(dto);
        return service.salvar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody ClienteDTO dto) {
        Cliente cliente = ClienteMapper.toEntity(dto);
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
