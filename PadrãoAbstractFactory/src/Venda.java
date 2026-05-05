package mercadinho.abstractfactory;

public class Venda {

    private Pagamento pagamento;
    private Recibo recibo;

    public Venda(FabricaVenda fabrica) {
        this.pagamento = fabrica.createPagamento();
        this.recibo = fabrica.createRecibo();
    }

    public String processarPagamento() {
        return this.pagamento.processar();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }
}