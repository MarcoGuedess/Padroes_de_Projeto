package padroesestruturais.facade;

public class Caixa extends SetorPizzaria {

    private static Caixa instancia;

    private Caixa() {}

    public static Caixa getInstancia() {
        if (instancia == null) {
            instancia = new Caixa();
        }
        return instancia;
    }
}
