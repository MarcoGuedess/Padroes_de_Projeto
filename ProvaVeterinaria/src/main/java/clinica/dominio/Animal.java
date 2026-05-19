package clinica.dominio;

public class Animal {

    private String nome;
    private String especie;
    private boolean adotado;
    private Tutor tutor;

    public Animal(String nome, String especie, boolean adotado, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.adotado = adotado;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Animal{nome='" + nome + "', especie='" + especie + "', adotado=" + adotado + ", tutor=" + tutor.getNome() + "}";
    }
}
