package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarItensDisponiveisCardapio() {
        Cardapio cardapio = new Cardapio(
                new ItemCardapio("X-Burguer", true),
                new ItemCardapio("X-Bacon", true),
                new ItemCardapio("X-Salada", false),
                new ItemCardapio("Vegano", true)
        );
        assertEquals(3, Inventario.contarItensDisponiveisCardapio(cardapio));
    }

    @Test
    void deveContarTotalItensCardapio() {
        Cardapio cardapio = new Cardapio(
                new ItemCardapio("X-Burguer", true),
                new ItemCardapio("X-Bacon", true),
                new ItemCardapio("X-Salada", false),
                new ItemCardapio("Vegano", true)
        );
        assertEquals(4, Inventario.contarTotalItensCardapio(cardapio));
    }
}