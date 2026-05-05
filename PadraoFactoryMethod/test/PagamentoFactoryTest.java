package mercadinho.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("Cheque"); // Não existe a classe PagamentoCheque
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("Fiado"); // Existe, mas não implementa a interface
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inválido", e.getMessage());
        }
    }
}