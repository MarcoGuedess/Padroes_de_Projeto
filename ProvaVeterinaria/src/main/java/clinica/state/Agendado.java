package clinica.state;

import clinica.Atendimento;

/**
 * Estado: Agendado — pode ir para EmAtendimento ou Cancelado.
 */
public class Agendado implements SituacaoAtendimento {

    @Override
    public void iniciar(Atendimento atendimento) {
        atendimento.setSituacao(new EmAtendimento());
        atendimento.notificarObservadores("INICIADO");
    }

    @Override
    public void finalizar(Atendimento atendimento) {
        throw new IllegalStateException("Atendimento agendado não pode ser finalizado diretamente.");
    }

    @Override
    public void cancelar(Atendimento atendimento) {
        atendimento.setSituacao(new Cancelado());
        atendimento.notificarObservadores("CANCELADO");
    }

    @Override
    public String getNome() {
        return "Agendado";
    }
}
