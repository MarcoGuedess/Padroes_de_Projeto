package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class SetorPizzaria {

    private List<Pedido> pedidosComPendencia = new ArrayList<Pedido>();

    public void addPedidoPendente(Pedido pedido) {
        pedidosComPendencia.add(pedido);
    }

    public boolean verificarPedidoComPendencia(Pedido pedido) {
        return pedidosComPendencia.contains(pedido);
    }
}
