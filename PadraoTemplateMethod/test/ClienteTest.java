package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public void deveRetornarClientePadraoCategoriaPrata() {
        ClientePadrao cliente = new ClientePadrao();
        cliente.setCodigo(1);
        cliente.setNome("João");
        cliente.setComprasMes(40.0f);
        cliente.setMesesFidelidade(50.0f);
        // score = (40 + 50) / 2 = 45.0 -> Prata
        assertEquals("Cliente{codigo=1, nome='João', categoria=Prata}", cliente.getInfo());
    }

    @Test
    public void deveRetornarClientePadraoCategoriaOuro() {
        ClientePadrao cliente = new ClientePadrao();
        cliente.setCodigo(2);
        cliente.setNome("Maria");
        cliente.setComprasMes(70.0f);
        cliente.setMesesFidelidade(80.0f);
        // score = (70 + 80) / 2 = 75.0 -> Ouro
        assertEquals("Cliente{codigo=2, nome='Maria', categoria=Ouro}", cliente.getInfo());
    }

    @Test
    public void deveRetornarClienteVIPCategoriaOuro() {
        ClienteVIP cliente = new ClienteVIP();
        cliente.setCodigo(3);
        cliente.setNome("Carlos");
        cliente.setComprasMes(60.0f);
        cliente.setMesesFidelidade(60.0f);
        // score = (60 + 60) / 2 = 60.0 -> Ouro (< 70)
        assertEquals("ClienteVIP{codigo=3, nome='Carlos', categoria=Ouro}", cliente.getInfo());
    }

    @Test
    public void deveRetornarClienteVIPCategoriaDiamante() {
        ClienteVIP cliente = new ClienteVIP();
        cliente.setCodigo(4);
        cliente.setNome("Ana");
        cliente.setComprasMes(80.0f);
        cliente.setMesesFidelidade(90.0f);
        // score = (80 + 90) / 2 = 85.0 -> Diamante
        assertEquals("ClienteVIP{codigo=4, nome='Ana', categoria=Diamante}", cliente.getInfo());
    }
}
