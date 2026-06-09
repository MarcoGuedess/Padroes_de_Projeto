public class EstoqueTest {
    public static void main(String[] args) {
        Produto Energetico = new Produto("Energetico", 100);
        Estoque estoque = new Estoque();

        // 1. Teste de entrada de produto
        Comando entrada = new EntradaProdutoComando(Energetico, 20);
        estoque.executarComando(entrada);
        System.out.println("Após entrada: " + Energetico.getQuantidade()); // esperado: 120

        // 2. Teste de saída de produto
        Comando saida = new SaidaProdutoComando(Energetico, 15);
        estoque.executarComando(saida);
        System.out.println("Após saída: " + Energetico.getQuantidade()); // esperado: 105

        // 3. Teste de desfazer última saída
        estoque.desfazerUltimoComando();
        System.out.println("Após desfazer saída: " + Energetico.getQuantidade()); // esperado: 120

        // 4. Teste de desfazer última entrada
        estoque.desfazerUltimoComando();
        System.out.println("Após desfazer entrada: " + Energetico.getQuantidade()); // esperado: 100

        // 5. Teste de múltiplas operações seguidas
        estoque.executarComando(new EntradaProdutoComando(Energetico, 50)); // 150
        estoque.executarComando(new SaidaProdutoComando(Energetico, 30));   // 120
        System.out.println("Após múltiplas operações: " + Energetico.getQuantidade()); // esperado: 120

        // 6. Teste de desfazer múltiplas operações
        estoque.desfazerUltimoComando(); // desfaz saída de 30 → volta para 150
        estoque.desfazerUltimoComando(); // desfaz entrada de 50 → volta para 100
        System.out.println("Após desfazer múltiplas operações: " + Energetico.getQuantidade()); // esperado: 100
    }
}

