package mercadinho.decorator;

public abstract class ProdutoDecorator implements Produto {

    private Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public abstract float getPercentualTaxa();

    public float getPreco() {
        return this.produto.getPreco() * (1 + (this.getPercentualTaxa() / 100));
    }

    public abstract String getNomeTaxa();

    public String getDescricao() {
        return this.produto.getDescricao() + " + " + this.getNomeTaxa();
    }
}
