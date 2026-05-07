package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoCancelamentoItem implements TipoRequisicao {

    private static TipoRequisicaoCancelamentoItem instancia;

    private TipoRequisicaoCancelamentoItem() {
    }

    public static TipoRequisicaoCancelamentoItem getInstancia() {
        if (instancia == null) {
            instancia = new TipoRequisicaoCancelamentoItem();
        }
        return instancia;
    }
}
