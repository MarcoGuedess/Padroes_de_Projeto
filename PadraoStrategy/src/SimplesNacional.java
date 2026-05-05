package mercadinho.strategy;

public class SimplesNacional implements CalculoImposto {

    public float calcular(float valorTransacao) {
        return valorTransacao * 0.06f;
    }

    public String getNome() {
        return "Simples Nacional (6%)";
    }
}
