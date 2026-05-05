package mercadinho.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveCalcularImpostoSimplesNacional() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new SimplesNacional());
        assertEquals(600.0f, transacao.calcularImposto(), 0.01f);
    }

    @Test
    void deveCalcularImpostoLucroPresumido() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroPresumido());
        assertEquals(1500.0f, transacao.calcularImposto(), 0.01f);
    }

    @Test
    void deveCalcularImpostoLucroReal() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroReal());
        assertEquals(2500.0f, transacao.calcularImposto(), 0.01f);
    }

    @Test
    void deveCalcularValorLiquidoSimplesNacional() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new SimplesNacional());
        assertEquals(9400.0f, transacao.calcularValorLiquido(), 0.01f);
    }

    @Test
    void deveCalcularValorLiquidoLucroPresumido() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroPresumido());
        assertEquals(8500.0f, transacao.calcularValorLiquido(), 0.01f);
    }

    @Test
    void deveCalcularValorLiquidoLucroReal() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroReal());
        assertEquals(7500.0f, transacao.calcularValorLiquido(), 0.01f);
    }

    @Test
    void deveRetornarNomeRegimeFiscalSimplesNacional() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new SimplesNacional());
        assertEquals("Simples Nacional (6%)", transacao.getNomeRegimeFiscal());
    }

    @Test
    void deveRetornarNomeRegimeFiscalLucroPresumido() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroPresumido());
        assertEquals("Lucro Presumido (15%)", transacao.getNomeRegimeFiscal());
    }

    @Test
    void deveRetornarNomeRegimeFiscalLucroReal() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        transacao.setCalculoImposto(new LucroReal());
        assertEquals("Lucro Real (25%)", transacao.getNomeRegimeFiscal());
    }

    @Test
    void deveUsarSimplesNacionalPorPadrao() {
        Transacao transacao = new Transacao("Venda", 10000.0f);
        assertEquals("Simples Nacional (6%)", transacao.getNomeRegimeFiscal());
    }

}
