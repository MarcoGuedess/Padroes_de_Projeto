package clinica.observer;

import clinica.Atendimento;

/**
 * Observer: avisa o veterinário quando o atendimento for cancelado.
 */
public class VeterinarioObservador implements ObservadorAtendimento {

    private String nomeVeterinario;

    public VeterinarioObservador(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    @Override
    public void atualizar(Atendimento atendimento, String evento) {
        if ("CANCELADO".equals(evento)) {
            System.out.println("[VETERINÁRIO] " + nomeVeterinario
                    + " foi avisado: atendimento de " + atendimento.getAnimal().getNome()
                    + " foi cancelado.");
        }
    }
}
