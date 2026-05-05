package mercadinho.strategy;

public interface CalculoImposto {
    float calcular(float valorTransacao);
    String getNome();
}
