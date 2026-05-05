package mercadinho.decorator;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new ProdutoBasico("Arroz 5kg", 25.0f);
        System.out.println("Produto: " + arroz.getDescricao());
        System.out.println("Preço base: R$ " + arroz.getPreco());

        Produto arrozComICMS = new TaxaICMS(arroz);
        System.out.println("\nApós ICMS: " + arrozComICMS.getDescricao());
        System.out.println("Preço: R$ " + arrozComICMS.getPreco());

        Produto arrozComICMSeIOF = new TaxaIOF(arrozComICMS);
        System.out.println("\nApós ICMS + IOF: " + arrozComICMSeIOF.getDescricao());
        System.out.println("Preço: R$ " + arrozComICMSeIOF.getPreco());

        Produto arrozFinal = new TaxaEntrega(arrozComICMSeIOF);
        System.out.println("\nPreço final (ICMS + IOF + Entrega): " + arrozFinal.getDescricao());
        System.out.println("Preço: R$ " + arrozFinal.getPreco());
    }
}
