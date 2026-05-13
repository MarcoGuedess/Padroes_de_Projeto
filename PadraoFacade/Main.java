package padroesestruturais.facade;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE LIBERAÇÃO DE PEDIDOS DA PIZZARIA (FACADE) ===\n");

        // Cenário 1: Pedido perfeito, sem pendências em nenhum setor
        Pedido pedido1 = new Pedido();
        System.out.println("Cenário 1: Pedido 1 (Sem pendências)");
        System.out.println("-> Liberado para entrega? " + (pedido1.liberarParaEntrega() ? "Sim! Pode enviar." : "Não. Retido.") + "\n");

        // Cenário 2: Pedido com pagamento pendente no Caixa
        Pedido pedido2 = new Pedido();
        Caixa.getInstancia().addPedidoPendente(pedido2); // Adicionamos a pendência manualmente para testar
        System.out.println("Cenário 2: Pedido 2 (O cliente ainda não pagou no Caixa)");
        System.out.println("-> Liberado para entrega? " + (pedido2.liberarParaEntrega() ? "Sim! Pode enviar." : "Não. Retido no Caixa.") + "\n");

        // Cenário 3: Pedido com falta de ingredientes no Estoque
        Pedido pedido3 = new Pedido();
        Estoque.getInstancia().addPedidoPendente(pedido3);
        System.out.println("Cenário 3: Pedido 3 (Faltou pepperoni no Estoque)");
        System.out.println("-> Liberado para entrega? " + (pedido3.liberarParaEntrega() ? "Sim! Pode enviar." : "Não. Retido por falta de ingredientes.") + "\n");

        // Cenário 4: Pedido ainda não ficou pronto na Cozinha
        Pedido pedido4 = new Pedido();
        Cozinha.getInstancia().addPedidoPendente(pedido4);
        System.out.println("Cenário 4: Pedido 4 (A pizza ainda está a assar na Cozinha)");
        System.out.println("-> Liberado para entrega? " + (pedido4.liberarParaEntrega() ? "Sim! Pode enviar." : "Não. Retido na Cozinha.") + "\n");
    }
}