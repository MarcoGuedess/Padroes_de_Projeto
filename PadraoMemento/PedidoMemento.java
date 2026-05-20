package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class PedidoMemento {

    private final List<ItemPedido> itens;

    public PedidoMemento(List<ItemPedido> itens) {
        this.itens = new ArrayList<>(itens);
    }

    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens);
    }
}
