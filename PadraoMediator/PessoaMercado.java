package padroescomportamentais.mediator;

public class PessoaMercado {

    public String elogiarGerencia(String mensagem) {
        return SAC.getInstancia().receberElogioGerencia(mensagem);
    }

    public String reclamarGerencia(String mensagem) {
        return SAC.getInstancia().receberReclamacaoGerencia(mensagem);
    }

    public String sugerirGerencia(String mensagem) {
        return SAC.getInstancia().receberSugestaoGerencia(mensagem);
    }
}
