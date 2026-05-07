package padroescomportamentais.chainofresponsability;

public class FiscalCaixa extends FuncionarioMercado {

    public FiscalCaixa(FuncionarioMercado superior) {
        listaRequisicoes.add(TipoRequisicaoCancelamentoItem.getInstancia());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Fiscal de Caixa";
    }
}
