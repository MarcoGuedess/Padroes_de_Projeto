package padroesestruturais.flyweight;

public class Pedido {

    private String cliente;
    private Sabor sabor;

    public Pedido(String cliente, Sabor sabor) {
        this.cliente = cliente;
        this.sabor = sabor;
    }

    public String obterPedido() {
        return "Pedido{" +
                "cliente='" + this.cliente + '\'' +
                ", sabor='" + sabor.getNomeSabor() + '\'' +
                ", precoBase='" + sabor.getPrecoBase() + '\'' +
                '}';
    }
}