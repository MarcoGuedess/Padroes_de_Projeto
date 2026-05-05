package mercadinho.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfiguracoesMercadoTest {

    @Test
    public void deveRetornarNomeMercado() {
        // Configura o valor na instância única
        ConfiguracoesMercado.getInstance().setNomeMercado("Mercadinho 1");

        // Verifica se o valor retornado é o mesmo que foi configurado
        assertEquals("Mercadinho 1", ConfiguracoesMercado.getInstance().getNomeMercado());
    }

    @Test
    public void deveRetornarOperadorCaixaLogado() {
        // Configura o valor na instância única
        ConfiguracoesMercado.getInstance().setOperadorCaixaLogado("Operador 1");

        // Verifica se o valor retornado é o mesmo que foi configurado
        assertEquals("Operador 1", ConfiguracoesMercado.getInstance().getOperadorCaixaLogado());
    }

}