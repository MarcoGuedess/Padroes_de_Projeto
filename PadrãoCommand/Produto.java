public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void entrada(int qtd) {
        this.quantidade += qtd;
        System.out.println(qtd + " unidades adicionadas. Estoque atual: " + quantidade);
    }

    public void saida(int qtd) {
        this.quantidade -= qtd;
        System.out.println(qtd + " unidades removidas. Estoque atual: " + quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }
}
