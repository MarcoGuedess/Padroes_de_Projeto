package clinica.decorator;

/**
 * Decorator: adiciona R$ 80,00 pelo serviço de banho pós-consulta.
 */
public class BanhoPosConsulta extends ServicoDecorator {

    private static final double VALOR_BANHO = 80.0;

    public BanhoPosConsulta(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public double getValor() {
        return servico.getValor() + VALOR_BANHO;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Banho Pós-Consulta (R$ 80,00)";
    }
}
