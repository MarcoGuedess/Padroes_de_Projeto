package mercadinho.decorator;

public class TaxaEntrega extends ProdutoDecorator {

    public TaxaEntrega(Produto produto) {
        super(produto);
    }

    public float getPercentualTaxa() {
        return 5.0f;
    }

    public String getNomeTaxa() {
        return "Entrega(5%)";
    }
}
