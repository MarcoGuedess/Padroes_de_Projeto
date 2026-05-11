package padroescomportamentais.mediator;

public class SAC {

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberElogioGerencia(String mensagem) {
        return "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>" + Gerencia.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoGerencia(String mensagem) {
        return "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>" + Gerencia.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoGerencia(String mensagem) {
        return "O SAC agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n>>" + Gerencia.getInstancia().receberSugestao(mensagem);
    }
}
