package mercadinho.state;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 500.0f);
        System.out.println("Estado: " + conta.getNomeEstado() + " | Saldo: R$ " + conta.getSaldo());

        conta.sacar(600.0f);
        System.out.println("Após saque de R$600: Estado=" + conta.getNomeEstado() + " | Saldo: R$ " + conta.getSaldo());

        conta.depositar(200.0f);
        System.out.println("Após depósito de R$200: Estado=" + conta.getNomeEstado() + " | Saldo: R$ " + conta.getSaldo());

        conta.bloquear();
        System.out.println("Após bloqueio: Estado=" + conta.getNomeEstado());

        conta.reativar();
        System.out.println("Após reativação: Estado=" + conta.getNomeEstado());

        conta.encerrar();
        System.out.println("Após encerramento: Estado=" + conta.getNomeEstado());

        boolean resultado = conta.depositar(100.0f);
        System.out.println("Tentativa de depósito em conta encerrada: " + resultado);
    }
}
