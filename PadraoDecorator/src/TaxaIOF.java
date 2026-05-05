package mercadinho.decorator;

public class TaxaIOF extends ProdutoDecorator {

    public TaxaIOF(Produto produto) {
        super(produto);
    }

    public float getPercentualTaxa() {
        return 3.0f;
    }

    public String getNomeTaxa() {
        return "IOF(3%)";
    }
}
