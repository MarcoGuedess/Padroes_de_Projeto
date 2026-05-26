package padroescriacao.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO O PADRÃO PROTOTYPE ===");

        try {
            // 1. Criamos a receita original (o Protótipo)
            ReceitaBase receitaPadrao = new ReceitaBase("Pão Brioche", "Bovina 200g");
            Hamburguer hamburguerOriginal = new Hamburguer(1, "João (Original)", receitaPadrao, "Ponto da carne: Ao ponto");

            System.out.println("ORIGINAL: " + hamburguerOriginal);

            // 2. O cliente Maria quer um igual, mas sem cebola (Clonagem simples)
            Hamburguer cloneMaria = hamburguerOriginal.clone();
            cloneMaria.setIdPedido(2);
            cloneMaria.setCliente("Maria (Clone)");
            cloneMaria.setObservacao("Sem cebola");

            // 3. O cliente Pedro quer um igual, mas quer mudar o tipo de pão (Deep Copy na prática)
            Hamburguer clonePedro = hamburguerOriginal.clone();
            clonePedro.setIdPedido(3);
            clonePedro.setCliente("Pedro (Clone Alterado)");
            clonePedro.setObservacao("Bem passado");
            // Alteramos o objeto interno (ReceitaBase) apenas do Pedro
            clonePedro.getReceitaBase().setTipoPao("Pão Australiano");

            System.out.println("\n--- Depois das clonagens e alterações ---");
            System.out.println("ORIGINAL (Permanece intacto): " + hamburguerOriginal);
            System.out.println("CLONE 1  (Maria): " + cloneMaria);
            System.out.println("CLONE 2  (Pedro): " + clonePedro);

        } catch (CloneNotSupportedException e) {
            System.out.println("Erro ao clonar o hambúrguer: " + e.getMessage());
        }
    }
}