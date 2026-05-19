package clinica.state;

import clinica.Atendimento;

/**
 * Estado: EmAtendimento — pode ir apenas para Finalizado.
 */
public class EmAtendimento implements SituacaoAtendimento {

    @Override
    public void iniciar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento já está em andamento.");
    }

    @Override
    public void finalizar(Atendimento atendimento) {
        atendimento.setSituacao(new Finalizado());
        atendimento.notificarObservadores("FINALIZADO");
    }

    @Override
    public void cancelar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento em andamento não pode ser cancelado.");
    }

    @Override
    public String getNome() {
        return "EmAtendimento";
    }
}
