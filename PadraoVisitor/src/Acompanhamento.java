public class Acompanhamento implements ItemCardapio {

    private int codigo;
    private String nome;
    private double preco;
    private int porcaoGramas;

    public Acompanhamento(int codigo, String nome, double preco, int porcaoGramas) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.porcaoGramas = porcaoGramas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getPorcaoGramas() {
        return porcaoGramas;
    }

    @Override
    public String aceitar(ItemVisitor visitor) {
        return visitor.visitarAcompanhamento(this);
    }
}
