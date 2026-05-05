package mercadinho.strategy;

public class LucroPresumido implements CalculoImposto {

    public float calcular(float valorTransacao) {
        return valorTransacao * 0.15f;
    }

    public String getNome() {
        return "Lucro Presumido (15%)";
    }
}
