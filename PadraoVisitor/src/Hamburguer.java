public class Hamburguer implements ItemCardapio {

    private int codigo;
    private String nome;
    private double preco;
    private String tipo;

    public Hamburguer(int codigo, String nome, double preco, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    @Override
    public String aceitar(ItemVisitor visitor) {
        return visitor.visitarHamburguer(this);
    }
}
