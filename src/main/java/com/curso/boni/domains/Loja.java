package com.curso.boni.domains;

import com.curso.boni.enums.LojaStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "loja")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String endereco;

    @Enumerated(EnumType.STRING)
    private LojaStatus status;

    public Loja() {
    }

    public Loja(Long id, String nome, String endereco, LojaStatus status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public LojaStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setStatus(LojaStatus status) {
        this.status = status;
    }
}