package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoDesconto implements TipoRequisicao {

    private static TipoRequisicaoDesconto instancia;

    private TipoRequisicaoDesconto() {
    }

    public static TipoRequisicaoDesconto getInstancia() {
        if (instancia == null) {
            instancia = new TipoRequisicaoDesconto();
        }
        return instancia;
    }
}
