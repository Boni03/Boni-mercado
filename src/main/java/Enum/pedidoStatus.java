package Enum;

public enum pedidoStatus {
    COMPRADO(0,"COMPRADO"),
    ROTA(1,"ROTA"),
    ENTREGUE(2,"ENTREGUE");

    private Integer id;
    private String descricao;

    pedidoStatus(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
