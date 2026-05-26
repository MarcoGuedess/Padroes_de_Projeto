package padroescriacao.prototype;

public class Hamburguer implements Cloneable {
    private int idPedido;
    private String cliente;
    private ReceitaBase receitaBase;
    private String observacao;

    public Hamburguer(int idPedido, String cliente, ReceitaBase receitaBase, String observacao) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.receitaBase = receitaBase;
        this.observacao = observacao;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ReceitaBase getReceitaBase() {
        return receitaBase;
    }

    public void setReceitaBase(ReceitaBase receitaBase) {
        this.receitaBase = receitaBase;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public Hamburguer clone() throws CloneNotSupportedException {
        Hamburguer hamburguerClone = (Hamburguer) super.clone();
        hamburguerClone.receitaBase = (ReceitaBase) hamburguerClone.receitaBase.clone();
        return hamburguerClone;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "idPedido=" + idPedido +
                ", cliente='" + cliente + '\'' +
                ", receitaBase=" + receitaBase +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}