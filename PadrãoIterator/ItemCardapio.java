package padroescomportamentais.iterator;

public class ItemCardapio {
    private String nome;
    private boolean disponivel;

    public ItemCardapio(String nome, boolean disponivel) {
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}