package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo extends ItemPedido {

    private List<ItemPedido> itens;

    public Combo(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemPedido>();
    }

    public void addItem(ItemPedido item) {
        this.itens.add(item);
    }

    @Override
    public String getDetalhes() {
        String detalhes = "Combo: " + this.getDescricao() + "\n";
        for (ItemPedido item : itens) {
            detalhes += item.getDetalhes();
        }
        return detalhes;
    }
}
