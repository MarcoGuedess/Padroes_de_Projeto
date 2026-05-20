package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double getTotal() {
        return itens.stream().mapToDouble(ItemPedido::getPreco).sum();
    }

    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens);
    }

    public PedidoMemento salvarEstado() {
        return new PedidoMemento(itens);
    }

    public void restaurarEstado(PedidoMemento memento) {
        this.itens = memento.getItens();
    }

    @Override
    public String toString() {
        if (itens.isEmpty()) {
            return "Pedido vazio.";
        }
        StringBuilder sb = new StringBuilder("Pedido:\n");
        for (ItemPedido item : itens) {
            sb.append("  - ").append(item).append("\n");
        }
        sb.append("Total: R$").append(String.format("%.2f", getTotal()));
        return sb.toString();
    }
}
