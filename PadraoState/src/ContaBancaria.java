package mercadinho.state;

public class ContaBancaria {

    private String titular;
    private float saldo;
    private ContaEstado estado;

    public ContaBancaria(String titular, float saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.estado = ContaEstadoAtiva.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean depositar(float valor) {
        return estado.depositar(this, valor);
    }

    public boolean sacar(float valor) {
        return estado.sacar(this, valor);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public boolean reativar() {
        return estado.reativar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaEstado getEstado() {
        return estado;
    }
}
