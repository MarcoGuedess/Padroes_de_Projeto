public class GatewayMercadoPago {
    private double valor;

    public void efetuarPagamento(double valor) {
        this.valor = valor;
        System.out.println("Pagamento realizado via Mercado Pago: R$" + valor);
    }

    public double getValor() {
        return valor;
    }
}
