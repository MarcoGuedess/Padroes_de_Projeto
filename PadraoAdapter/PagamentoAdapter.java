public class PagamentoAdapter implements IPagamento {
    private GatewayPayPal paypal;
    private GatewayMercadoPago mercadoPago;
    private double valor;

    public PagamentoAdapter(GatewayPayPal paypal) {
        this.paypal = paypal;
    }

    public PagamentoAdapter(GatewayMercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String processarPagamento() {
        if (paypal != null) {
            paypal.pagarComPayPal(valor);
            return "Processado via PayPal";
        } else if (mercadoPago != null) {
            mercadoPago.efetuarPagamento(valor);
            return "Processado via Mercado Pago";
        }
        return "Nenhum gateway configurado";
    }
}
