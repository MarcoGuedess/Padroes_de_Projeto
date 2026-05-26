package padroescriacao.prototype;

public class ReceitaBase implements Cloneable {
    private String tipoPao;
    private String tipoCarne;

    public ReceitaBase(String tipoPao, String tipoCarne) {
        super();
        this.tipoPao = tipoPao;
        this.tipoCarne = tipoCarne;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ReceitaBase{" +
                "tipoPao='" + tipoPao + '\'' +
                ", tipoCarne='" + tipoCarne + '\'' +
                '}';
    }
}