package padroescomportamentais.templatemethod;

public abstract class Cliente {

    private int codigo;
    protected String nome;
    private float comprasMes;
    private float mesesFidelidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprasMes() {
        return comprasMes;
    }

    public void setComprasMes(float comprasMes) {
        this.comprasMes = comprasMes;
    }

    public float getMesesFidelidade() {
        return mesesFidelidade;
    }

    public void setMesesFidelidade(float mesesFidelidade) {
        this.mesesFidelidade = mesesFidelidade;
    }

    public float calcularScore() {
        return (this.comprasMes + this.mesesFidelidade) / 2;
    }

    public abstract String verificarCategoria();

    public String getTipo() {
        return "Cliente";
    }

    // Template Method
    public String getInfo() {
        return getTipo() + "{codigo=" + this.codigo + ", nome='" + this.nome + "', categoria=" + this.verificarCategoria() + "}";
    }
}
