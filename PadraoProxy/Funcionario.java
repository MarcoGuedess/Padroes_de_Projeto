public class Funcionario {
    private String nome;
    private boolean administrador;

    public Funcionario(String nome, boolean administrador) {
        this.nome = nome;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAdministrador() {
        return administrador;
    }
}
