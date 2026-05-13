package padroesestruturais.composite;

public class Pedido {

    private ItemPedido carrinho;

    public void setCarrinho(ItemPedido carrinho) {
        this.carrinho = carrinho;
    }

    public String getCarrinho() {
        if (this.carrinho == null) {
            throw new NullPointerException("Pedido vazio");
        }
        return this.carrinho.getDetalhes();
    }
}
