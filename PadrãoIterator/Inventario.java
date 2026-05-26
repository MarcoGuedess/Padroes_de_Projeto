package padroescomportamentais.iterator;

import java.util.Iterator;

public class Inventario {

    public static Integer contarItensDisponiveisCardapio(Cardapio cardapio) {
        int quantidade = 0;
        for (ItemCardapio item : cardapio) {
            if (item.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalItensCardapio(Cardapio cardapio) {
        int quantidade = 0;
        for (Iterator a = cardapio.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}