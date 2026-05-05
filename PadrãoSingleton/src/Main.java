package mercadinho.singleton;

public class Main {
    public static void main(String[] args) {

        ConfiguracoesMercado config = ConfiguracoesMercado.getInstance();
        config.setNomeMercado("Mercadinho do Marco");
        config.setOperadorCaixaLogado("João da Silva");

        ConfiguracoesMercado configTelaVenda = ConfiguracoesMercado.getInstance();

        System.out.println("Bem-vindo ao " + configTelaVenda.getNomeMercado());
        System.out.println("Caixa atual: " + configTelaVenda.getOperadorCaixaLogado());
    }
}