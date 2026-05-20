package padroescomportamentais.memento;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        ItemPedido xBurguer    = new ItemPedido("X-Burguer",       18.50);
        ItemPedido batataFrita = new ItemPedido("Batata Frita",     10.00);
        ItemPedido refri       = new ItemPedido("Refrigerante",      7.00);
        ItemPedido sorvete     = new ItemPedido("Sorvete de Creme",  8.00);

        System.out.println("=== Hamburgueria - Montagem do Pedido ===\n");

        // Salva estado inicial (pedido vazio) e adiciona o primeiro item
        historico.salvar(pedido);
        pedido.adicionarItem(xBurguer);
        System.out.println("Adicionado: " + xBurguer);
        System.out.println(pedido + "\n");

        // Salva e adiciona batata
        historico.salvar(pedido);
        pedido.adicionarItem(batataFrita);
        System.out.println("Adicionado: " + batataFrita);
        System.out.println(pedido + "\n");

        // Salva e adiciona refrigerante
        historico.salvar(pedido);
        pedido.adicionarItem(refri);
        System.out.println("Adicionado: " + refri);
        System.out.println(pedido + "\n");

        // Salva e adiciona sorvete
        historico.salvar(pedido);
        pedido.adicionarItem(sorvete);
        System.out.println("Adicionado: " + sorvete);
        System.out.println(pedido + "\n");

        System.out.println("--- Cliente mudou de ideia: desfazendo sorvete ---\n");
        historico.desfazer(pedido);
        System.out.println(pedido + "\n");

        System.out.println("--- Desfazendo refrigerante também ---\n");
        historico.desfazer(pedido);
        System.out.println(pedido + "\n");

        System.out.println("--- Desfazendo tudo ---\n");
        historico.desfazer(pedido);
        historico.desfazer(pedido);
        System.out.println(pedido);
    }
}
