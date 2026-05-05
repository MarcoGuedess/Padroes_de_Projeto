package mercadinho.strategy;

public class Main {
    public static void main(String[] args) {
        Transacao venda = new Transacao("Venda de mercadorias", 10000.0f);

        System.out.println("Transação: " + venda.getDescricao());
        System.out.println("Valor bruto: R$ " + venda.getValor());

        // Simples Nacional
        venda.setCalculoImposto(new SimplesNacional());
        System.out.println("\nRegime: " + venda.getNomeRegimeFiscal());
        System.out.println("Imposto: R$ " + venda.calcularImposto());
        System.out.println("Valor líquido: R$ " + venda.calcularValorLiquido());

        // Lucro Presumido
        venda.setCalculoImposto(new LucroPresumido());
        System.out.println("\nRegime: " + venda.getNomeRegimeFiscal());
        System.out.println("Imposto: R$ " + venda.calcularImposto());
        System.out.println("Valor líquido: R$ " + venda.calcularValorLiquido());

        // Lucro Real
        venda.setCalculoImposto(new LucroReal());
        System.out.println("\nRegime: " + venda.getNomeRegimeFiscal());
        System.out.println("Imposto: R$ " + venda.calcularImposto());
        System.out.println("Valor líquido: R$ " + venda.calcularValorLiquido());
    }
}
