package mercadinho.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoUnitarioTest {

    @Test
    void deveRetornarPrecoProdutoUnitarioSemDesconto() {
        Promocao promocao = new SemDesconto();
        ProdutoUnitario produto = new ProdutoUnitario(100.0f);
        produto.setPromocao(promocao);
        assertEquals(100.0f, produto.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProdutoUnitarioComClienteFiel() {
        Promocao promocao = new ClienteFiel();
        ProdutoUnitario produto = new ProdutoUnitario(100.0f);
        produto.setPromocao(promocao);
        assertEquals(85.0f, produto.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoProdutoUnitarioComLiquidacao() {
        Promocao promocao = new Liquidacao();
        ProdutoUnitario produto = new ProdutoUnitario(100.0f);
        produto.setPromocao(promocao);
        assertEquals(70.0f, produto.calcularPrecoFinal(), 0.01f);
    }

}