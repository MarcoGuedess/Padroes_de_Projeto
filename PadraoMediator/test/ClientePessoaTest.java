package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientePessoaTest {

    @Test
    public void deveRetornarRespostaElogio() {
        ClientePessoa cliente = new ClientePessoa();
        String resultado = cliente.elogiarGerencia("Ótimo atendimento!");
        assertEquals(
            "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>A Gerência agradece a mensagem: Ótimo atendimento!",
            resultado
        );
    }

    @Test
    public void deveRetornarRespostaReclamacao() {
        ClientePessoa cliente = new ClientePessoa();
        String resultado = cliente.reclamarGerencia("Produto vencido na prateleira.");
        assertEquals(
            "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>A Gerência vai procurar melhorar o serviço: Produto vencido na prateleira.",
            resultado
        );
    }

    @Test
    public void deveRetornarRespostaSugestao() {
        ClientePessoa cliente = new ClientePessoa();
        String resultado = cliente.sugerirGerencia("Incluir produtos orgânicos.");
        assertEquals(
            "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>A Gerência vai analisar a sugestão: Incluir produtos orgânicos.",
            resultado
        );
    }
}
