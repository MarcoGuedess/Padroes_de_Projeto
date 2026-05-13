package padroesestruturais.composite;

public class Main {

    public static void main(String[] args) {

        // 1. Criando produtos individuais (As folhas)
        Produto pizzaCalabresa = new Produto("Pizza de Calabresa G", 65.0);
        Produto pizzaQueijo = new Produto("Pizza 4 Queijos G", 70.0);
        Produto refri = new Produto("Coca-Cola 2L", 12.0);

        Produto pudim = new Produto("Pudim de Leite", 15.0);
        Produto sorvete = new Produto("Sorvete de Chocolate", 18.0);

        // 2. Criando um Combo menor (Sobremesas)
        Combo comboSobremesa = new Combo("Sobremesas Especiais");
        comboSobremesa.addItem(pudim);
        comboSobremesa.addItem(sorvete);

        // 3. Criando o Combo Principal (O pacote completo que o cliente pediu)
        Combo comboFamilia = new Combo("Combo Família Final de Semana");
        comboFamilia.addItem(pizzaCalabresa);
        comboFamilia.addItem(pizzaQueijo);
        comboFamilia.addItem(refri);

        // Adicionando um Combo dentro de outro Combo! (Aqui brilha o padrão Composite)
        comboFamilia.addItem(comboSobremesa);

        // 4. Montando o Pedido
        Pedido pedido = new Pedido();
        pedido.setCarrinho(comboFamilia);

        // 5. Imprimindo
        System.out.println("=== CUPÃO DO PEDIDO ===");
        System.out.println(pedido.getCarrinho());
    }
}