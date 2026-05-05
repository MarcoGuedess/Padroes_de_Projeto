package mercadinho.decorator;

public class ProdutoBasico implements Produto {

    private String nome;
    private float precoBase;

    public ProdutoBasico(String nome, float precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public float getPreco() {
        return precoBase;
    }

    public String getDescricao() {
        return nome;
    }
}
