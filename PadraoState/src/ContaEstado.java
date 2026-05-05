package mercadinho.state;

public abstract class ContaEstado {

    public abstract String getEstado();

    public boolean depositar(ContaBancaria conta, float valor) {
        return false;
    }

    public boolean sacar(ContaBancaria conta, float valor) {
        return false;
    }

    public boolean bloquear(ContaBancaria conta) {
        return false;
    }

    public boolean encerrar(ContaBancaria conta) {
        return false;
    }

    public boolean reativar(ContaBancaria conta) {
        return false;
    }
}
