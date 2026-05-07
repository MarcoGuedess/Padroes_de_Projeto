package padroescomportamentais.chainofresponsability;

public class DiretorFinanceiro extends FuncionarioMercado {

    public DiretorFinanceiro(FuncionarioMercado superior) {
        listaRequisicoes.add(TipoRequisicaoEstornoCartao.getInstancia());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }
}
