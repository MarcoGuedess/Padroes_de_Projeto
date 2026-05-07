package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class FuncionarioMercado {

    protected ArrayList listaRequisicoes = new ArrayList();
    private FuncionarioMercado funcionarioSuperior;

    public FuncionarioMercado getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(FuncionarioMercado funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String autorizarRequisicao(Requisicao requisicao) {
        if (listaRequisicoes.contains(requisicao.getTipoRequisicao())) {
            return getDescricaoCargo();
        } else if (funcionarioSuperior != null) {
            return funcionarioSuperior.autorizarRequisicao(requisicao);
        } else {
            return "Não autorizado";
        }
    }
}
