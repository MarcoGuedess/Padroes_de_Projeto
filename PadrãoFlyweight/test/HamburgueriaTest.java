package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HamburgueriaTest {

    @Test
    void deveRetornarPedidos() {
        Hamburgueria hamburgueria = new Hamburgueria();
        hamburgueria.registrarPedido("Jose", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Maria", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Ana", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Joao", "Artesanal Especial", 35.0);

        List<String> saida = Arrays.asList(
                "Pedido{cliente='Jose', sabor='X-Bacon', precoBase='25.0'}",
                "Pedido{cliente='Maria', sabor='X-Bacon', precoBase='25.0'}",
                "Pedido{cliente='Ana', sabor='X-Bacon', precoBase='25.0'}",
                "Pedido{cliente='Joao', sabor='Artesanal Especial', precoBase='35.0'}");

        assertEquals(saida, hamburgueria.obterPedidos());
    }

    @Test
    void deveRetornarTotalSabores() {
        Hamburgueria hamburgueria = new Hamburgueria();
        hamburgueria.registrarPedido("Jose", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Maria", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Ana", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Joao", "Artesanal Especial", 35.0);

        // Mesmo com 4 pedidos, foram instanciados apenas 2 sabores únicos (X-Bacon e Artesanal Especial)
        assertEquals(2, SaborFactory.getTotalSabores());
    }
}