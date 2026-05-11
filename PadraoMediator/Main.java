package padroescomportamentais.mediator;

public class Main {
    public static void main(String[] args) {
        ClientePessoa cliente = new ClientePessoa();
        System.out.println(cliente.elogiarGerencia("Ótimo atendimento!"));
        System.out.println(cliente.reclamarGerencia("Produto vencido na prateleira."));
        System.out.println(cliente.sugerirGerencia("Incluir produtos orgânicos."));
    }
}
