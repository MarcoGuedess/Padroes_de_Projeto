public class SaidaProdutoComando implements Comando {
    private Produto produto;
    private int quantidade;

    public SaidaProdutoComando(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        produto.saida(quantidade);
    }

    @Override
    public void cancelar() {
        produto.entrada(quantidade); // desfaz a saída
    }
}

