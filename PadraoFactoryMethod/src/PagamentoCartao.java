package mercadinho.factorymethod;

public class PagamentoCartao implements IPagamento {

    public String processar() {
        return "Pagamento via Cartão processado";
    }

    public String estornar() {
        return "Pagamento via Cartão estornado";
    }
}