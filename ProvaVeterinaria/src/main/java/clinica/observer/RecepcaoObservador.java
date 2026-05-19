package clinica.observer;

import clinica.Atendimento;

/**
 * Observer: avisa a recepção quando o atendimento for finalizado.
 */
public class RecepcaoObservador implements ObservadorAtendimento {

    @Override
    public void atualizar(Atendimento atendimento, String evento) {
        if ("FINALIZADO".equals(evento)) {
            System.out.println("[RECEPÇÃO] Atendimento de " + atendimento.getAnimal().getNome()
                    + " foi finalizado. Valor final: R$ "
                    + String.format("%.2f", atendimento.getServico().getValor()));
        }
    }
}
