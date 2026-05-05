package mercadinho.bridge;

public abstract class Produto {

    protected Promocao promocao;
    protected float precoBase;

    public Produto(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPrecoFinal();
}