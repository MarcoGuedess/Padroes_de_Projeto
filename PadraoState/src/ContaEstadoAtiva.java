package mercadinho.state;

public class ContaEstadoAtiva extends ContaEstado {

    private static ContaEstadoAtiva instance;

    private ContaEstadoAtiva() {}

    public static ContaEstadoAtiva getInstance() {
        if (instance == null) {
            instance = new ContaEstadoAtiva();
        }
        return instance;
    }

    public String getEstado() {
        return "Ativa";
    }

    public boolean depositar(ContaBancaria conta, float valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        return true;
    }

    public boolean sacar(ContaBancaria conta, float valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        } else {
            conta.setEstado(ContaEstadoNegativada.getInstance());
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
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
