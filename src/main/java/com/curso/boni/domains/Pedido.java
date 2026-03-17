package com.curso.boni.domains;

import com.curso.boni.enums.PedidoStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PedidoStatus status;

    public Pedido() {
    }

    public Pedido(Long id, PedidoStatus status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }
}