package clinica.decorator;

/**
 * Decorator: aplica 10% de desconto para animais adotados.
 */
public class DescontoAdotado extends ServicoDecorator {

    public DescontoAdotado(ServicoVeterinario servico) {
        super(servico);
    }

    @Override
    public double getValor() {
        return servico.getValor() * 0.90;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + " + Desconto Adotado (10%)";
    }
}
