package Enum;

public enum lojaStatus {
    ELECTRONICOS(0,"ELETRONICOS"),
    ROUPAS(1,"ROUPAS"),
    COMIDA(2,"COMIDA"),
    ACESSORIOS(3,"ACESSORIOS");

    private Integer id;
    private String descricao;

    lojaStatus(Integer id, String descricao) {
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
