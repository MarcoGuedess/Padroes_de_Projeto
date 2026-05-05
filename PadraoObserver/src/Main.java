package mercadinho.observer;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento tesouro = new ContaInvestimento("Tesouro Direto", 1000.0f, 12.5f);

        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");

        joao.inscrever(tesouro);
        maria.inscrever(tesouro);

        System.out.println("Atualizando valor do Tesouro Direto para R$1050...");
        tesouro.atualizarValor(1050.0f);

        System.out.println("\nAtualizando valor do Tesouro Direto para R$980...");
        tesouro.atualizarValor(980.0f);
    }
}
