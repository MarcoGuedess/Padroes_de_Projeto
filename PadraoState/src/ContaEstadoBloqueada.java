package mercadinho.state;

public class ContaEstadoBloqueada extends ContaEstado {

    private static ContaEstadoBloqueada instance;

    private ContaEstadoBloqueada() {}

    public static ContaEstadoBloqueada getInstance() {
        if (instance == null) {
            instance = new ContaEstadoBloqueada();
        }
        return instance;
    }

    public String getEstado() {
        return "Bloqueada";
    }

    public boolean reativar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
