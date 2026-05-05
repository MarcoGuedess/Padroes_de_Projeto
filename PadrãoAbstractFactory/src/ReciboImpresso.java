package mercadinho.abstractfactory;

public class ReciboImpresso implements Recibo {
    public String emitir() {
        return "Recibo Impresso na via do cliente";
    }
}