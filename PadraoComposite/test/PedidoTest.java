package padroesestruturais.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    public void deveRetornarDetalhesPedido() {
        Combo comboFamilia = new Combo("Combo Família");
        comboFamilia.addItem(new Produto("Pizza Gigante", 45.9));
        comboFamilia.addItem(new Produto("Refrigerante 2L", 12.5));

        Combo comboSobremesa = new Combo("Combo Sobremesa");
        comboSobremesa.addItem(new Produto("Pudim", 8.0));
        comboSobremesa.addItem(new Produto("Sorvete", 6.5));

        comboFamilia.addItem(comboSobremesa);

        Pedido pedido = new Pedido();
        pedido.setCarrinho(comboFamilia);

        String esperado = "Combo: Combo Família\n" +
                "Produto: Pizza Gigante - preço: R$ 45.9\n" +
                "Produto: Refrigerante 2L - preço: R$ 12.5\n" +
                "Combo: Combo Sobremesa\n" +
                "Produto: Pudim - preço: R$ 8.0\n" +
                "Produto: Sorvete - preço: R$ 6.5\n";

        assertEquals(esperado, pedido.getCarrinho());
    }

    @Test
    public void deveRetornarExcecaoPedidoVazio() {
        Pedido pedido = new Pedido();
        NullPointerException excecao = assertThrows(NullPointerException.class, pedido::getCarrinho);
        assertEquals("Pedido vazio", excecao.getMessage());
    }
}
