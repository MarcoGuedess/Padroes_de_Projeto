package padroesestruturais.flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO O PADRÃO FLYWEIGHT ===");

        Hamburgueria hamburgueria = new Hamburgueria();

        // 1. Registando vários pedidos (Notem os sabores repetidos)
        hamburgueria.registrarPedido("Carlos", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Ana", "X-Bacon", 25.0);
        hamburgueria.registrarPedido("Beatriz", "X-Bacon", 25.0);

        hamburgueria.registrarPedido("Fernando", "Artesanal Especial", 35.0);
        hamburgueria.registrarPedido("Sofia", "Artesanal Especial", 35.0);

        hamburgueria.registrarPedido("Rui", "Smash Simples", 18.0);

        // 2. Listando todos os pedidos processados
        System.out.println("Lista de Pedidos Processados:");
        for (String pedidoDetalhe : hamburgueria.obterPedidos()) {
            System.out.println(" - " + pedidoDetalhe);
        }

        // 3. Provando a eficácia do Flyweight
        System.out.println("\n--- Relatório de Memória / Flyweight ---");
        System.out.println("Total de Pedidos realizados (Estado Extrínseco): " + hamburgueria.obterPedidos().size());

        // Esta é a magia: apenas 3 objetos Sabor foram criados na memória!
        System.out.println("Total de instâncias de Sabor criadas em memória (Estado Intrínseco/Flyweight): " + SaborFactory.getTotalSabores());
    }
}