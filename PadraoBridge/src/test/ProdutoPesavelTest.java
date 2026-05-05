package mercadinho.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoPesavelTest {

    @Test
    void deveRetornarPrecoProdutoPesavelSemDesconto() {
        Promocao promocao = new SemDesconto();
        ProdutoPesavel produto = new ProdutoPesavel(50.0f);
        produto.setPromocao(promocao);
        produto.setPesoKg(2.0f);
        assertEquals(100.0f, produto.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProdutoPesavelComClienteFiel() {
        Promocao promocao = new ClienteFiel();
        ProdutoPesavel produto = new ProdutoPesavel(50.0f);
        produto.setPromocao(promocao);
        produto.setPesoKg(2.0f);
        assertEquals(85.0f, produto.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProdutoPesavelComLiquidacao() {
        Promocao promocao = new Liquidacao();
        ProdutoPesavel produto = new ProdutoPesavel(50.0f);
        produto.setPromocao(promocao);
        produto.setPesoKg(2.0f);
        assertEquals(70.0f, produto.calcularPrecoFinal(), 0.01f);
    }

}