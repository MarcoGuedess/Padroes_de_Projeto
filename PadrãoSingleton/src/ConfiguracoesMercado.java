package mercadinho.singleton;

public class ConfiguracoesMercado {


    private ConfiguracoesMercado() {};


    private static ConfiguracoesMercado instance = new ConfiguracoesMercado();

    public static ConfiguracoesMercado getInstance() {
        return instance;
    }

    private String nomeMercado;
    private String operadorCaixaLogado;

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public String getOperadorCaixaLogado() {
        return operadorCaixaLogado;
    }

    public void setOperadorCaixaLogado(String operadorCaixaLogado) {
        this.operadorCaixaLogado = operadorCaixaLogado;
    }
}