package padroescomportamentais.templatemethod;

public class ClientePadrao extends Cliente {

    @Override
    public String verificarCategoria() {
        if (calcularScore() >= 60.0f) {
            return "Ouro";
        }
        return "Prata";
    }
}
