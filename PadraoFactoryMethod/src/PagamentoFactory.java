package mercadinho.factorymethod;

public class PagamentoFactory {

    public static IPagamento obterPagamento(String pagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            // Vai procurar a classe com o nome "PagamentoPix", "PagamentoCartao", etc.
            classe = Class.forName("mercadinho.factorymethod.Pagamento" + pagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Pagamento inexistente");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Pagamento inválido");
        }
        return (IPagamento) objeto;
    }
}