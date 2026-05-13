package padroesestruturais.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    public void deveRetornarTrueParaPedidoSemPendencias() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.liberarParaEntrega());
    }

    @Test
    public void deveRetornarFalseParaPedidoComPendenciaNoCaixa() {
        Pedido pedido = new Pedido();
        Caixa.getInstancia().addPedidoPendente(pedido);
        assertFalse(pedido.liberarParaEntrega());
    }

    @Test
    public void deveRetornarFalseParaPedidoComPendenciaNoEstoque() {
        Pedido pedido = new Pedido();
        Estoque.getInstancia().addPedidoPendente(pedido);
        assertFalse(pedido.liberarParaEntrega());
    }

    @Test
    public void deveRetornarFalseParaPedidoComPendenciaNaCozinha() {
        Pedido pedido = new Pedido();
        Cozinha.getInstancia().addPedidoPendente(pedido);
        assertFalse(pedido.liberarParaEntrega());
    }
}
