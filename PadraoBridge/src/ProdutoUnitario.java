package mercadinho.bridge;

public class ProdutoUnitario extends Produto {

    public ProdutoUnitario(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase * (1 - this.promocao.percentualDesconto());
    }
}