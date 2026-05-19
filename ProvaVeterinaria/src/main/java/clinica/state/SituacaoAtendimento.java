package clinica.state;

import clinica.Atendimento;

/**
 * Interface do State Pattern para situações do atendimento.
 * Cada estado concreto decide quais transições são permitidas.
 */
public interface SituacaoAtendimento {

    void iniciar(Atendimento atendimento);

    void finalizar(Atendimento atendimento);

    void cancelar(Atendimento atendimento);

    String getNome();
}
