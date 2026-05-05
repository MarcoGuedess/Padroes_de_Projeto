package mercadinho.abstractfactory;

public class FabricaVendaFisica implements FabricaVenda {
    @Override
    public Pagamento createPagamento() {
        return new PagamentoDinheiro();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboImpresso();
    }
}