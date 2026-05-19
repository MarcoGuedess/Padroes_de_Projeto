package clinica.state;

import clinica.Atendimento;

/**
 * Estado: Finalizado — não permite mais nenhuma transição.
 */
public class Finalizado implements SituacaoAtendimento {

    @Override
    public void iniciar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento finalizado não pode ser reaberto.");
    }

    @Override
    public void finalizar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento já foi finalizado.");
    }

    @Override
    public void cancelar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento finalizado não pode ser cancelado.");
    }

    @Override
    public String getNome() {
        return "Finalizado";
    }
}
