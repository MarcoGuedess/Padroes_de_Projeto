package padroesestruturais.composite;

public class Produto extends ItemPedido {

    private double preco;

    public Produto(String descricao, double preco) {
        super(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getDetalhes() {
        return "Produto: " + this.getDescricao() + " - preço: R$ " + this.preco + "\n";
    }
}
