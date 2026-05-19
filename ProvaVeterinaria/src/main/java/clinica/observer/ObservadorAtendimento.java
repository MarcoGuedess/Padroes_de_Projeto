package clinica.observer;

import clinica.Atendimento;

/**
 * Interface do Observer Pattern para interessados nas mudanças do atendimento.
 */
public interface ObservadorAtendimento {

    void atualizar(Atendimento atendimento, String evento);
}
