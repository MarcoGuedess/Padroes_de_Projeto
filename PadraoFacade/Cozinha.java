package padroesestruturais.facade;

public class Cozinha extends SetorPizzaria {

    private static Cozinha instancia;

    private Cozinha() {}

    public static Cozinha getInstancia() {
        if (instancia == null) {
            instancia = new Cozinha();
        }
        return instancia;
    }
}
