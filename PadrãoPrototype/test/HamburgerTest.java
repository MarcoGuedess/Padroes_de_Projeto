package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Hamburguer hamburguerOriginal = new Hamburguer(1, "Cliente Original", new ReceitaBase("Pão Brioche", "Bovina 200g"), "Sem cebola");

        Hamburguer hamburguerClone = hamburguerOriginal.clone();
        hamburguerClone.setIdPedido(2);
        hamburguerClone.setCliente("Cliente Clonado");
        hamburguerClone.getReceitaBase().setTipoPao("Pão Australiano");

        assertEquals("Hamburguer{idPedido=1, cliente='Cliente Original', receitaBase=ReceitaBase{tipoPao='Pão Brioche', tipoCarne='Bovina 200g'}, observacao='Sem cebola'}", hamburguerOriginal.toString());
        assertEquals("Hamburguer{idPedido=2, cliente='Cliente Clonado', receitaBase=ReceitaBase{tipoPao='Pão Australiano', tipoCarne='Bovina 200g'}, observacao='Sem cebola'}", hamburguerClone.toString());
    }
}