package com.curso.boni.service;

import com.curso.boni.domains.Categoria;
import com.curso.boni.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria atualizar(Long id, Categoria categoriaAtualizada) {
        Categoria categoria = repository.findById(id).orElseThrow();

        categoria.setNome(categoriaAtualizada.getNome());

        return repository.save(categoria);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}