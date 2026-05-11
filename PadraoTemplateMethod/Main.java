package padroescomportamentais.templatemethod;

public class Main {
    public static void main(String[] args) {
        ClientePadrao clientePadrao = new ClientePadrao();
        clientePadrao.setCodigo(1);
        clientePadrao.setNome("João");
        clientePadrao.setComprasMes(40.0f);
        clientePadrao.setMesesFidelidade(50.0f);
        System.out.println(clientePadrao.getInfo());

        ClienteVIP clienteVIP = new ClienteVIP();
        clienteVIP.setCodigo(2);
        clienteVIP.setNome("Ana");
        clienteVIP.setComprasMes(80.0f);
        clienteVIP.setMesesFidelidade(90.0f);
        System.out.println(clienteVIP.getInfo());
    }
}
