package com.curso.boni.service;

import com.curso.boni.domains.Loja;
import com.curso.boni.repository.LojaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    private final LojaRepository repository;

    public LojaService(LojaRepository repository) {
        this.repository = repository;
    }

    public List<Loja> listar() {
        return repository.findAll();
    }

    public Loja salvar(Loja loja) {
        return repository.save(loja);
    }

    public Loja atualizar(Long id, Loja lojaAtualizada) {
        Loja loja = repository.findById(id).orElseThrow();

        loja.setNome(lojaAtualizada.getNome());
        loja.setEndereco(lojaAtualizada.getEndereco());
        loja.setStatus(lojaAtualizada.getStatus());

        return repository.save(loja);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}