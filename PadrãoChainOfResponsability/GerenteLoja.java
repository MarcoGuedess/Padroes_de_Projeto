package padroescomportamentais.chainofresponsability;

public class GerenteLoja extends FuncionarioMercado {

    public GerenteLoja(FuncionarioMercado superior) {
        listaRequisicoes.add(TipoRequisicaoDesconto.getInstancia());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente da Loja";
    }
}
