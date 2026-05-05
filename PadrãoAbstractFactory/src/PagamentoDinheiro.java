package mercadinho.abstractfactory;

public class PagamentoDinheiro implements Pagamento {
    public String processar() {
        return "Pagamento em Dinheiro";
    }
}