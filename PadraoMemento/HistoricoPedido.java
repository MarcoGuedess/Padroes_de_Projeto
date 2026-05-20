package padroescomportamentais.memento;

import java.util.Stack;

public class HistoricoPedido {

    private final Stack<PedidoMemento> historico = new Stack<>();

    public void salvar(Pedido pedido) {
        historico.push(pedido.salvarEstado());
    }

    public void desfazer(Pedido pedido) {
        if (!historico.isEmpty()) {
            pedido.restaurarEstado(historico.pop());
        }
    }

    public boolean temHistorico() {
        return !historico.isEmpty();
    }
}
