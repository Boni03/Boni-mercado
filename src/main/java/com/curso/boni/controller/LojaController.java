package com.curso.boni.controller;

import com.curso.boni.domains.Loja;
import com.curso.boni.dto.LojaDTO;
import com.curso.boni.mapper.LojaMapper;
import com.curso.boni.service.LojaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    private final LojaService service;

    public LojaController(LojaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Loja> listar() {
        return service.listar();
    }

    @PostMapping
    public Loja criar(@RequestBody LojaDTO dto) {
        Loja loja = LojaMapper.toEntity(dto);
        return service.salvar(loja);
    }

    @PutMapping("/{id}")
    public Loja atualizar(@PathVariable Long id, @RequestBody LojaDTO dto) {
        Loja loja = LojaMapper.toEntity(dto);
        return service.atualizar(id, loja);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}