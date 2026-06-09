public class ClienteEcommerce {
    public static void main(String[] args) {
        // Usando PayPal
        GatewayPayPal paypal = new GatewayPayPal();
        IPagamento pagamentoPayPal = new PagamentoAdapter(paypal);
        pagamentoPayPal.setValor(150.0);
        System.out.println(pagamentoPayPal.processarPagamento());

        // Usando Mercado Pago
        GatewayMercadoPago mercadoPago = new GatewayMercadoPago();
        IPagamento pagamentoMercadoPago = new PagamentoAdapter(mercadoPago);
        pagamentoMercadoPago.setValor(200.0);
        System.out.println(pagamentoMercadoPago.processarPagamento());
    }
}

