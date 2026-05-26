package padroescomportamentais.iterator;

public class MainIterator {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO O PADRÃO ITERATOR ===");

        // 1. Criamos os itens do cardápio (alguns disponíveis, outros esgotados)
        ItemCardapio item1 = new ItemCardapio("X-Burguer Tradicional", true);
        ItemCardapio item2 = new ItemCardapio("X-Bacon Duplo", true);
        ItemCardapio item3 = new ItemCardapio("Smash Burger", false); // Esgotado
        ItemCardapio item4 = new ItemCardapio("Hambúrguer Vegano de Grão", true);
        ItemCardapio item5 = new ItemCardapio("Batata Frita Média", false); // Esgotado

        // 2. Adicionamos tudo ao Agregado (Cardápio)
        Cardapio cardapio = new Cardapio(item1, item2, item3, item4, item5);

        // 3. Utilizamos a classe cliente (Inventario) que consome o Iterator
        System.out.println("Iniciando contagem do inventário...\n");

        int totalItens = Inventario.contarTotalItensCardapio(cardapio);
        int itensDisponiveis = Inventario.contarItensDisponiveisCardapio(cardapio);

        // Mostrando os resultados no console
        System.out.println("Total de itens cadastrados no sistema: " + totalItens);
        System.out.println("Total de itens atualmente DISPONÍVEIS para venda: " + itensDisponiveis);
        System.out.println("Total de itens ESGOTADOS: " + (totalItens - itensDisponiveis));
    }
}