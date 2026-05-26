package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Hamburgueria {

    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(String cliente, String nomeSabor, double precoBase) {
        Sabor sabor = SaborFactory.getSabor(nomeSabor, precoBase);
        Pedido pedido = new Pedido(cliente, sabor);
        pedidos.add(pedido);
    }

    public List<String> obterPedidos() {
        List<String> saida = new ArrayList<String>();
        for (Pedido pedido : this.pedidos) {
            saida.add(pedido.obterPedido());
        }
        return saida;
    }
}