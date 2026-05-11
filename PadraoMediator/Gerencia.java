package padroescomportamentais.mediator;

public class Gerencia implements SetorMercado {

    private static Gerencia instancia = new Gerencia();

    private Gerencia() {}

    public static Gerencia getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String m) {
        return "A Gerência vai procurar melhorar o serviço: " + m;
    }

    @Override
    public String receberElogio(String m) {
        return "A Gerência agradece a mensagem: " + m;
    }

    @Override
    public String receberSugestao(String m) {
        return "A Gerência vai analisar a sugestão: " + m;
    }
}
