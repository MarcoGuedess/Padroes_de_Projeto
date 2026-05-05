package mercadinho.strategy;

public class LucroReal implements CalculoImposto {

    public float calcular(float valorTransacao) {
        return valorTransacao * 0.25f;
    }

    public String getNome() {
        return "Lucro Real (25%)";
    }
}
