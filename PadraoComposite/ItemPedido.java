package padroesestruturais.composite;

public abstract class ItemPedido {

    private String descricao;

    public ItemPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getDetalhes();
}
