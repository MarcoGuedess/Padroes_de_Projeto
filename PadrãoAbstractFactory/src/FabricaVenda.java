package mercadinho.abstractfactory;

public interface FabricaVenda {
    Pagamento createPagamento();
    Recibo createRecibo();
}