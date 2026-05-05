package mercadinho.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoTest {

    @Test
    void deveProcessarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão processado", pagamento.processar());
    }

    @Test
    void deveEstornarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão estornado", pagamento.estornar());
    }

}