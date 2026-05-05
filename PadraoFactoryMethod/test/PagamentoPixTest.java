package mercadinho.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoPixTest {

    @Test
    void deveProcessarPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix processado", pagamento.processar());
    }

    @Test
    void deveEstornarPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix estornado", pagamento.estornar());
    }

}