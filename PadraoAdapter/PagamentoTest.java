public class PagamentoTest {
    public static void main(String[] args) {
        // 1. Teste com PayPal
        GatewayPayPal paypal = new GatewayPayPal();
        IPagamento pagamentoPayPal = new PagamentoAdapter(paypal);
        pagamentoPayPal.setValor(150.0);
        System.out.println("Resultado PayPal: " + pagamentoPayPal.processarPagamento());

        // 2. Teste com Mercado Pago
        GatewayMercadoPago mercadoPago = new GatewayMercadoPago();
        IPagamento pagamentoMercadoPago = new PagamentoAdapter(mercadoPago);
        pagamentoMercadoPago.setValor(200.0);
        System.out.println("Resultado Mercado Pago: " + pagamentoMercadoPago.processarPagamento());

        // 3. Teste de alteração de valor antes de processar
        pagamentoPayPal.setValor(300.0);
        System.out.println("Resultado PayPal com valor alterado: " + pagamentoPayPal.processarPagamento());

        // 4. Teste de múltiplos pagamentos seguidos
        pagamentoMercadoPago.setValor(50.0);
        System.out.println("Resultado Mercado Pago (1ª vez): " + pagamentoMercadoPago.processarPagamento());
        pagamentoMercadoPago.setValor(75.0);
        System.out.println("Resultado Mercado Pago (2ª vez): " + pagamentoMercadoPago.processarPagamento());

        // 5. Teste sem gateway configurado
        PagamentoAdapter vazio = new PagamentoAdapter((GatewayPayPal) null);
        vazio.setValor(100.0);
        System.out.println("Resultado sem gateway: " + vazio.processarPagamento());
    }
}

