package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoTrocaBasica implements TipoRequisicao {

    private static TipoRequisicaoTrocaBasica instancia;

    private TipoRequisicaoTrocaBasica() {
    }

    public static TipoRequisicaoTrocaBasica getInstancia() {
        if (instancia == null) {
            instancia = new TipoRequisicaoTrocaBasica();
        }
        return instancia;
    }
}
