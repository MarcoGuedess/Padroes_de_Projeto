package clinica.decorator;

/**
 * Serviço veterinário concreto (componente base do Decorator Pattern).
 */
public class ServicoBase implements ServicoVeterinario {

    private String descricao;
    private double valor;

    public ServicoBase(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
