public class Bebida implements ItemCardapio {

    private int codigo;
    private String nome;
    private double preco;
    private String tamanho;

    public Bebida(int codigo, String nome, double preco, String tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
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

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String aceitar(ItemVisitor visitor) {
        return visitor.visitarBebida(this);
    }
}
