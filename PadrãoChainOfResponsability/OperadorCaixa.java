package padroescomportamentais.chainofresponsability;

public class OperadorCaixa extends FuncionarioMercado {

    public OperadorCaixa(FuncionarioMercado superior) {
        listaRequisicoes.add(TipoRequisicaoTrocaBasica.getInstancia());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Operador de Caixa";
    }
}
