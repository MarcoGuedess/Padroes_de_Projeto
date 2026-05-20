import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoVisitorTest {

    @Test
    void deveExibirHamburguer() {
        Hamburguer hamburguer = new Hamburguer(1, "Smash Burguer Duplo", 32.90, "Duplo");

        PedidoVisitor visitor = new PedidoVisitor();
        assertEquals("Hamburguer{codigo=1, nome='Smash Burguer Duplo', tipo='Duplo', preco=R$32.9}", visitor.exibir(hamburguer));
    }

    @Test
    void deveExibirBebida() {
        Bebida bebida = new Bebida(2, "Refrigerante", 8.00, "M");

        PedidoVisitor visitor = new PedidoVisitor();
        assertEquals("Bebida{codigo=2, nome='Refrigerante', tamanho='M', preco=R$8.0}", visitor.exibir(bebida));
    }

    @Test
    void deveExibirAcompanhamento() {
        Acompanhamento acompanhamento = new Acompanhamento(3, "Batata Frita", 14.50, 200);

        PedidoVisitor visitor = new PedidoVisitor();
        assertEquals("Acompanhamento{codigo=3, nome='Batata Frita', porcao=200g, preco=R$14.5}", visitor.exibir(acompanhamento));
    }
}
