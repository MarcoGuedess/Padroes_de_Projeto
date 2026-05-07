package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoEstornoCartao implements TipoRequisicao {

    private static TipoRequisicaoEstornoCartao instancia;

    private TipoRequisicaoEstornoCartao() {
    }

    public static TipoRequisicaoEstornoCartao getInstancia() {
        if (instancia == null) {
            instancia = new TipoRequisicaoEstornoCartao();
        }
        return instancia;
    }
}
