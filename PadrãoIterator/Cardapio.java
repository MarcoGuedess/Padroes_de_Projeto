package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cardapio implements Iterable<ItemCardapio>{

    private List<ItemCardapio> itens = new ArrayList<ItemCardapio>();

    public Cardapio(ItemCardapio... itens) {
        this.itens = Arrays.asList(itens);
    }

    @Override
    public Iterator<ItemCardapio> iterator() {
        return itens.iterator();
    }
}