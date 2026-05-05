package mercadinho.state;

public class ContaEstadoEncerrada extends ContaEstado {

    private static ContaEstadoEncerrada instance;

    private ContaEstadoEncerrada() {}

    public static ContaEstadoEncerrada getInstance() {
        if (instance == null) {
            instance = new ContaEstadoEncerrada();
        }
        return instance;
    }

    public String getEstado() {
        return "Encerrada";
    }
}
