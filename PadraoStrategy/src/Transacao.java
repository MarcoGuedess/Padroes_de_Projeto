package mercadinho.strategy;

public class Transacao {

    private String descricao;
    private float valor;
    private CalculoImposto calculoImposto;

    public Transacao(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.calculoImposto = new SimplesNacional();
    }

    public void setCalculoImposto(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public float calcularImposto() {
        return calculoImposto.calcular(this.valor);
    }

    public float calcularValorLiquido() {
        return this.valor - calcularImposto();
    }

    public String getNomeRegimeFiscal() {
        return calculoImposto.getNome();
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
