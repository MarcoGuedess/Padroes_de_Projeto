package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    public void deveAdicionarItemAoPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido("X-Burguer", 18.50));
        assertEquals(1, pedido.getItens().size());
        assertEquals(18.50, pedido.getTotal(), 0.01);
    }

    @Test
    public void deveDesfazerUltimoItemAdicionado() {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("X-Burguer", 18.50));

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("Batata Frita", 10.00));

        assertEquals(2, pedido.getItens().size());

        historico.desfazer(pedido);

        assertEquals(1, pedido.getItens().size());
        assertEquals("X-Burguer", pedido.getItens().get(0).getNome());
    }

    @Test
    public void deveDesfazerAtePedidoVazio() {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("X-Burguer", 18.50));
        assertEquals(1, pedido.getItens().size());

        historico.desfazer(pedido);
        assertEquals(0, pedido.getItens().size());
        assertEquals(0.0, pedido.getTotal(), 0.01);
    }

    @Test
    public void naoDeveDesfazerSemHistorico() {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        pedido.adicionarItem(new ItemPedido("X-Burguer", 18.50));
        assertFalse(historico.temHistorico());

        // Desfazer sem histórico não deve lançar exceção nem alterar o pedido
        historico.desfazer(pedido);
        assertEquals(1, pedido.getItens().size());
    }

    @Test
    public void deveCalcularTotalCorretamente() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido("X-Burguer",       18.50));
        pedido.adicionarItem(new ItemPedido("Batata Frita",    10.00));
        pedido.adicionarItem(new ItemPedido("Refrigerante",     7.00));
        assertEquals(35.50, pedido.getTotal(), 0.01);
    }

    @Test
    public void deveMantercHistoricoCorretoAposVariasOperacoes() {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("X-Burguer",    18.50));

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("Batata Frita", 10.00));

        historico.salvar(pedido);
        pedido.adicionarItem(new ItemPedido("Refrigerante",  7.00));

        assertEquals(3, pedido.getItens().size());

        historico.desfazer(pedido);
        assertEquals(2, pedido.getItens().size());

        historico.desfazer(pedido);
        assertEquals(1, pedido.getItens().size());

        historico.desfazer(pedido);
        assertEquals(0, pedido.getItens().size());

        assertFalse(historico.temHistorico());
    }
}
