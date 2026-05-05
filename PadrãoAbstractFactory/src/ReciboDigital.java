package mercadinho.abstractfactory;

public class ReciboDigital implements Recibo {
    public String emitir() {
        return "Recibo Digital enviado por e-mail";
    }
}