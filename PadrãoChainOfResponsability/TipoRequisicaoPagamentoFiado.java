package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoPagamentoFiado implements TipoRequisicao {

    private static TipoRequisicaoPagamentoFiado instancia;

    private TipoRequisicaoPagamentoFiado() {
    }

    public static TipoRequisicaoPagamentoFiado getInstancia() {
        if (instancia == null) {
            instancia = new TipoRequisicaoPagamentoFiado();
        }
        return instancia;
    }
}
