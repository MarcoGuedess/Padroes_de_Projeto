public class RegraValorMinimo implements InterpretadorRegra {
    private double minimo;

    public RegraValorMinimo(double minimo) {
        this.minimo = minimo;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.getValorCompra() >= minimo;
    }
}
