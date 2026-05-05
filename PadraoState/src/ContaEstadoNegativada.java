package mercadinho.state;

public class ContaEstadoNegativada extends ContaEstado {

    private static ContaEstadoNegativada instance;

    private ContaEstadoNegativada() {}

    public static ContaEstadoNegativada getInstance() {
        if (instance == null) {
            instance = new ContaEstadoNegativada();
        }
        return instance;
    }

    public String getEstado() {
        return "Negativada";
    }

    public boolean depositar(ContaBancaria conta, float valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        if (conta.getSaldo() >= 0) {
            conta.setEstado(ContaEstadoAtiva.getInstance());
        }
        return true;
    }

    public boolean bloquear(ContaBancaria conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
