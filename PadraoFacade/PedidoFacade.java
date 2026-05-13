package padroesestruturais.facade;

public class PedidoFacade {

    public static boolean verificarPendenciasLiberacao(Pedido pedido) {
        if (Caixa.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Estoque.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Cozinha.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}
