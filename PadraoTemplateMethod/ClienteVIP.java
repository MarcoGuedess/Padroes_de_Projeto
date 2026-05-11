package padroescomportamentais.templatemethod;

public class ClienteVIP extends Cliente {

    @Override
    public String verificarCategoria() {
        if (calcularScore() >= 70.0f) {
            return "Diamante";
        }
        return "Ouro";
    }

    @Override
    public String getTipo() {
        return "ClienteVIP";
    }
}
