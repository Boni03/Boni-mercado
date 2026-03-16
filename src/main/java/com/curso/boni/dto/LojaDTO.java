package com.curso.boni.dto;

public class LojaDTO {

    private String nome;
    private String endereco;
    private String status;

    public LojaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}