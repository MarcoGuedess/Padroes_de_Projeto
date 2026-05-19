package clinica;

import clinica.decorator.ServicoVeterinario;
import clinica.dominio.Animal;
import clinica.observer.ObservadorAtendimento;
import clinica.state.Agendado;
import clinica.state.SituacaoAtendimento;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe central do sistema.
 *
 * Padrões aplicados:
 *  - State:    a situação atual delega as transições (iniciar/finalizar/cancelar).
 *  - Observer: observadores são notificados a cada mudança de situação.
 *  - Decorator: o serviço pode ser decorado com acréscimos e descontos.
 */
public class Atendimento {

    private Animal animal;
    private ServicoVeterinario servico;
    private SituacaoAtendimento situacao;
    private List<ObservadorAtendimento> observadores = new ArrayList<>();

    public Atendimento(Animal animal, ServicoVeterinario servico) {
        this.animal = animal;
        this.servico = servico;
        this.situacao = new Agendado();
    }

    // --- Transições de estado ---

    public void iniciar() {
        situacao.iniciar(this);
    }

    public void finalizar() {
        situacao.finalizar(this);
    }

    public void cancelar() {
        situacao.cancelar(this);
    }

    // --- Observer ---

    public void adicionarObservador(ObservadorAtendimento observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorAtendimento observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String evento) {
        for (ObservadorAtendimento obs : observadores) {
            obs.atualizar(this, evento);
        }
    }

    // --- Getters ---

    public clinica.dominio.Tutor getTutor() {
        return animal.getTutor();
    }

    public Animal getAnimal() {
        return animal;
    }

    public ServicoVeterinario getServico() {
        return servico;
    }

    public SituacaoAtendimento getSituacao() {
        return situacao;
    }

    public String getNomeSituacao() {
        return situacao.getNome();
    }

    // --- Setter de situação (usado pelos estados) ---

    public void setSituacao(SituacaoAtendimento situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Atendimento{tutor=" + tutor.getNome()
                + ", animal=" + animal.getNome()
                + ", servico=" + servico.getDescricao()
                + ", valor=R$ " + String.format("%.2f", servico.getValor())
                + ", situacao=" + situacao.getNome() + "}";
    }
}
