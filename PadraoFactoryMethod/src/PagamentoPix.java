package mercadinho.factorymethod;

public class PagamentoPix implements IPagamento {

    public String processar() {
        return "Pagamento via Pix processado";
    }

    public String estornar() {
        return "Pagamento via Pix estornado";
    }
}