package clinica.state;

import clinica.Atendimento;

/**
 * Estado: Cancelado — não permite mais nenhuma transição.
 */
public class Cancelado implements SituacaoAtendimento {

    @Override
    public void iniciar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento cancelado não pode ser reiniciado.");
    }

    @Override
    public void finalizar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento cancelado não pode ser finalizado.");
    }

    @Override
    public void cancelar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento já está cancelado.");
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}
