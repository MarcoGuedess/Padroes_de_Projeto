package clinica.decorator;

/**
 * Decorator abstrato — delega para o serviço envolvido.
 */
public abstract class ServicoDecorator implements ServicoVeterinario {

    protected ServicoVeterinario servico;

    public ServicoDecorator(ServicoVeterinario servico) {
        this.servico = servico;
    }

    @Override
    public double getValor() {
        return servico.getValor();
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao();
    }
}
