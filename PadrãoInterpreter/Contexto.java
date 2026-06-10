public class Contexto {
    private boolean clienteVIP;
    private double valorCompra;

    public Contexto(boolean clienteVIP, double valorCompra) {
        this.clienteVIP = clienteVIP;
        this.valorCompra = valorCompra;
    }

    public boolean isClienteVIP() {
        return clienteVIP;
    }

    public double getValorCompra() {
        return valorCompra;
    }
}

