package clinica.decorator;

/**
 * Decorator: adiciona R$ 50,00 de taxa de atendimento domiciliar.
 */
public class TaxaDomiciliar extends ServicoDecorator {

    private static final double TAXA = 50.0;

    public TaxaDomiciliar(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public double getValor() {
        return servico.getValor() + TAXA;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Taxa Domiciliar (R$ 50,00)";
    }
}
