package com.curso.boni.controller;

import com.curso.boni.domains.Produto;
import com.curso.boni.dto.ProdutoDTO;
import com.curso.boni.mapper.ProdutoMapper;
import com.curso.boni.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }

    @PostMapping
    public Produto criar(@RequestBody ProdutoDTO dto) {
        Produto produto = ProdutoMapper.toEntity(dto);
        return service.salvar(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody ProdutoDTO dto) {
        Produto produto = ProdutoMapper.toEntity(dto);
        return service.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}