package mercadinho.bridge;

public class ProdutoPesavel extends Produto {

    private float pesoKg;

    public ProdutoPesavel(float precoBase) {
        super(precoBase);
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public float calcularPrecoFinal() {
        return (this.precoBase * this.pesoKg) * (1 - this.promocao.percentualDesconto());
    }
}