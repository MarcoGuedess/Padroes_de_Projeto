package mercadinho.abstractfactory;

public class PagamentoPix implements Pagamento {
    public String processar() {
        return "Pagamento via Pix";
    }
}