package clinica.observer;

import clinica.Atendimento;

/**
 * Observer: avisa o tutor quando o atendimento for iniciado.
 */
public class TutorObservador implements ObservadorAtendimento {

    @Override
    public void atualizar(Atendimento atendimento, String evento) {
        if ("INICIADO".equals(evento)) {
            System.out.println("[TUTOR] " + atendimento.getTutor().getNome()
                    + " foi avisado: atendimento de " + atendimento.getAnimal().getNome()
                    + " foi iniciado.");
        }
    }
}
