public class EntradaProdutoComando implements Comando {
    private Produto produto;
    private int quantidade;

    public EntradaProdutoComando(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        produto.entrada(quantidade);
    }

    @Override
    public void cancelar() {
        produto.saida(quantidade); // desfaz a entrada
    }
}

