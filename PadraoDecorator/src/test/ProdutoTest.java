package mercadinho.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarPrecoBaseProduto() {
        Produto produto = new ProdutoBasico("Arroz 5kg", 100.0f);
        assertEquals(100.0f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoBaseProduto() {
        Produto produto = new ProdutoBasico("Arroz 5kg", 100.0f);
        assertEquals("Arroz 5kg", produto.getDescricao());
    }

    @Test
    void deveRetornarPrecoProdutoComICMS() {
        Produto produto = new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals(112.0f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoProdutoComICMS() {
        Produto produto = new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals("Arroz 5kg + ICMS(12%)", produto.getDescricao());
    }

    @Test
    void deveRetornarPrecoProdutoComIOF() {
        Produto produto = new TaxaIOF(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals(103.0f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoProdutoComIOF() {
        Produto produto = new TaxaIOF(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals("Arroz 5kg + IOF(3%)", produto.getDescricao());
    }

    @Test
    void deveRetornarPrecoProdutoComEntrega() {
        Produto produto = new TaxaEntrega(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals(105.0f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoProdutoComEntrega() {
        Produto produto = new TaxaEntrega(new ProdutoBasico("Arroz 5kg", 100.0f));
        assertEquals("Arroz 5kg + Entrega(5%)", produto.getDescricao());
    }

    @Test
    void deveRetornarPrecoProdutoComICMSMaisIOF() {
        Produto produto = new TaxaIOF(new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f)));
        assertEquals(115.36f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoProdutoComICMSMaisIOF() {
        Produto produto = new TaxaIOF(new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f)));
        assertEquals("Arroz 5kg + ICMS(12%) + IOF(3%)", produto.getDescricao());
    }

    @Test
    void deveRetornarPrecoProdutoComICMSMaisEntrega() {
        Produto produto = new TaxaEntrega(new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f)));
        assertEquals(117.6f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProdutoComICMSMaisIOFMaisEntrega() {
        Produto produto = new TaxaEntrega(new TaxaIOF(new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f))));
        assertEquals(121.128f, produto.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoProdutoComICMSMaisIOFMaisEntrega() {
        Produto produto = new TaxaEntrega(new TaxaIOF(new TaxaICMS(new ProdutoBasico("Arroz 5kg", 100.0f))));
        assertEquals("Arroz 5kg + ICMS(12%) + IOF(3%) + Entrega(5%)", produto.getDescricao());
    }

}
