package com.curso.boni.dto;

public class PedidoDTO {

    private Long clienteId;
    private String status;

    public PedidoDTO() {
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}