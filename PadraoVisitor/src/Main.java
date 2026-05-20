public class Main {

    public static void main(String[] args) {
        PedidoVisitor visitor = new PedidoVisitor();

        ItemCardapio hamburguer = new Hamburguer(1, "Smash Burguer Duplo", 32.90, "Duplo");
        ItemCardapio bebida = new Bebida(2, "Refrigerante", 8.00, "M");
        ItemCardapio acompanhamento = new Acompanhamento(3, "Batata Frita", 14.50, 200);

        System.out.println(visitor.exibir(hamburguer));
        System.out.println(visitor.exibir(bebida));
        System.out.println(visitor.exibir(acompanhamento));
    }
}
