package padroescomportamentais.chainofresponsability;

public class Requisicao {

    private TipoRequisicao tipoRequisicao;

    public Requisicao(TipoRequisicao tipoRequisicao) {
        this.tipoRequisicao = tipoRequisicao;
    }

    public TipoRequisicao getTipoRequisicao() {
        return tipoRequisicao;
    }

    public void setTipoRequisicao(TipoRequisicao tipoRequisicao) {
        this.tipoRequisicao = tipoRequisicao;
    }
}
