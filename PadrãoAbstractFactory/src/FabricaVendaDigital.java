package mercadinho.abstractfactory;

public class FabricaVendaDigital implements FabricaVenda {
    @Override
    public Pagamento createPagamento() {
        return new PagamentoPix();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboDigital();
    }
}