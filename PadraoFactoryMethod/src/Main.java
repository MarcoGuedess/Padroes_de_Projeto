package mercadinho.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Pagamentos do Mercadinho ---\n");

        try {
            // 1. Testando um pagamento válido: Pix
            System.out.println("Cliente 1: Pagando com Pix...");
            IPagamento pagamento1 = PagamentoFactory.obterPagamento("Pix");
            System.out.println("Resultado: " + pagamento1.processar());
            System.out.println("Resultado: " + pagamento1.estornar());
            System.out.println("------------------------------------------");

            // 2. Testando outro pagamento válido: Cartão
            System.out.println("Cliente 2: Pagando com Cartão...");
            IPagamento pagamento2 = PagamentoFactory.obterPagamento("Cartao");
            System.out.println("Resultado: " + pagamento2.processar());
            System.out.println("------------------------------------------");

            // 3. Testando uma forma de pagamento que não existe no sistema (Cheque)
            System.out.println("Cliente 3: Tentando pagar com Cheque...");
            IPagamento pagamento3 = PagamentoFactory.obterPagamento("Cheque");
            System.out.println(pagamento3.processar());

        } catch (IllegalArgumentException e) {
            // Este bloco vai capturar os erros da nossa Fábrica (como Cheque ou Fiado)
            System.out.println("Erro no Caixa: " + e.getMessage());
        }
    }
}