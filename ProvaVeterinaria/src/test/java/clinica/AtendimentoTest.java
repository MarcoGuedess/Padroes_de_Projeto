package clinica;

import clinica.decorator.*;
import clinica.dominio.Animal;
import clinica.dominio.Tutor;
import clinica.observer.RecepcaoObservador;
import clinica.observer.TutorObservador;
import clinica.observer.VeterinarioObservador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    private Tutor tutor;
    private Animal animal;
    private Animal animalAdotado;
    private ServicoVeterinario consulta;

    @BeforeEach
    void setUp() {
        tutor = new Tutor("Maria", "99999-0000");
        animal = new Animal("Rex", "Cachorro", false, tutor);
        animalAdotado = new Animal("Bidu", "Gato", true, tutor);
        consulta = new ServicoBase("Consulta", 150.0);
    }

    // --- a) Mudança válida de situação ---

    @Test
    void devePassarDeAgendadoParaEmAtendimento() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        assertEquals("Agendado", atendimento.getNomeSituacao());

        atendimento.iniciar();

        assertEquals("EmAtendimento", atendimento.getNomeSituacao());
    }

    @Test
    void devePassarDeEmAtendimentoParaFinalizado() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        atendimento.iniciar();
        atendimento.finalizar();

        assertEquals("Finalizado", atendimento.getNomeSituacao());
    }

    @Test
    void devePassarDeAgendadoParaCancelado() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        atendimento.cancelar();

        assertEquals("Cancelado", atendimento.getNomeSituacao());
    }

    // --- a) Tentativa de mudança inválida ---

    @Test
    void naoDeveCancelarAtendimentoFinalizado() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        atendimento.iniciar();
        atendimento.finalizar();

        assertThrows(IllegalStateException.class, atendimento::cancelar);
    }

    @Test
    void naoDeveCancelarAtendimentoEmAndamento() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        atendimento.iniciar();

        assertThrows(IllegalStateException.class, atendimento::cancelar);
    }

    @Test
    void naoDeveFinalizarDiretamenteSemIniciar() {
        Atendimento atendimento = new Atendimento(animal, consulta);

        assertThrows(IllegalStateException.class, atendimento::finalizar);
    }

    // --- b) Envio automático de aviso ---

    @Test
    void deveChamarObservadorTutorAoIniciar() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        List<String> eventos = new ArrayList<>();
        atendimento.adicionarObservador((a, e) -> eventos.add("TUTOR:" + e));

        atendimento.iniciar();

        assertEquals(1, eventos.size());
        assertEquals("TUTOR:INICIADO", eventos.get(0));
    }

    @Test
    void deveChamarObservadorVeterinarioAoCancelar() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        List<String> eventos = new ArrayList<>();
        atendimento.adicionarObservador((a, e) -> eventos.add("VET:" + e));

        atendimento.cancelar();

        assertEquals(1, eventos.size());
        assertEquals("VET:CANCELADO", eventos.get(0));
    }

    @Test
    void deveChamarObservadorRecepcaoAoFinalizar() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        List<String> eventos = new ArrayList<>();
        atendimento.adicionarObservador((a, e) -> eventos.add("RECEP:" + e));

        atendimento.iniciar();
        atendimento.finalizar();

        assertTrue(eventos.contains("RECEP:FINALIZADO"));
    }

    @Test
    void deveChamarTodosObservadoresCadastrados() {
        Atendimento atendimento = new Atendimento(animal, consulta);
        List<String> eventos = new ArrayList<>();

        atendimento.adicionarObservador(new TutorObservador());
        atendimento.adicionarObservador(new VeterinarioObservador("Dr. Silva"));
        atendimento.adicionarObservador(new RecepcaoObservador());
        atendimento.adicionarObservador((a, e) -> eventos.add(e));

        atendimento.iniciar();
        atendimento.finalizar();

        assertTrue(eventos.contains("INICIADO"));
        assertTrue(eventos.contains("FINALIZADO"));
    }

    // --- c) Cálculo do valor final com mais de uma regra ---

    @Test
    void deveAplicarDescontoAnimalAdotado() {
        ServicoVeterinario servico = new DescontoAdotado(consulta);

        // 150 * 0.90 = 135
        assertEquals(135.0, servico.getValor(), 0.001);
        assertTrue(servico.getDescricao().contains("Desconto Adotado"));
    }

    @Test
    void deveAplicarTaxaDomiciliar() {
        ServicoVeterinario servico = new TaxaDomiciliar(consulta);

        // 150 + 50 = 200
        assertEquals(200.0, servico.getValor(), 0.001);
        assertTrue(servico.getDescricao().contains("Taxa Domiciliar"));
    }

    @Test
    void deveAplicarBanhoPosConsulta() {
        ServicoVeterinario servico = new BanhoPosConsulta(consulta);

        // 150 + 80 = 230
        assertEquals(230.0, servico.getValor(), 0.001);
        assertTrue(servico.getDescricao().contains("Banho Pós-Consulta"));
    }

    @Test
    void deveAplicarMultiplasRegrasAoMesmoTempo() {
        // consulta R$150 + banho R$80 + taxa domiciliar R$50 = 280; depois desconto 10% = 252
        ServicoVeterinario servico = new DescontoAdotado(
                new TaxaDomiciliar(
                        new BanhoPosConsulta(consulta)));

        // (150 + 80 + 50) * 0.90 = 252
        assertEquals(252.0, servico.getValor(), 0.001);
        assertTrue(servico.getDescricao().contains("Desconto Adotado"));
        assertTrue(servico.getDescricao().contains("Taxa Domiciliar"));
        assertTrue(servico.getDescricao().contains("Banho Pós-Consulta"));
    }
}
