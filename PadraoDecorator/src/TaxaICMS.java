package mercadinho.decorator;

public class TaxaICMS extends ProdutoDecorator {

    public TaxaICMS(Produto produto) {
        super(produto);
    }

    public float getPercentualTaxa() {
        return 12.0f;
    }

    public String getNomeTaxa() {
        return "ICMS(12%)";
    }
}
