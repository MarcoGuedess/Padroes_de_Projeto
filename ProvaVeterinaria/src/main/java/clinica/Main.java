package clinica;

import clinica.decorator.*;
import clinica.dominio.Animal;
import clinica.dominio.Tutor;
import clinica.observer.RecepcaoObservador;
import clinica.observer.TutorObservador;
import clinica.observer.VeterinarioObservador;

public class Main {

    public static void main(String[] args) {

        //   Dados base
        Tutor tutor = new Tutor("Maria", "99999-0000");
        Animal animal = new Animal("Rex", "Cachorro", true, tutor);

        //      Serviço com decorators empilhaod
        // Consulta R$150 + Banho R$80 + Taxa Domiciliar R$50 = R$280; depois -10% adotado = R$252
        ServicoVeterinario servico = new DescontoAdotado(
                new TaxaDomiciliar(
                        new BanhoPosConsulta(
                                new ServicoBase("Consulta", 150.0))));

        System.out.println("=== Serviço ===");
        System.out.println("Descrição : " + servico.getDescricao());
        System.out.printf("Valor final: R$ %.2f%n%n", servico.getValor());

        //      Atendimento
        Atendimento atendimento = new Atendimento(animal, servico);

        // Cadastra observadores
        atendimento.adicionarObservador(new TutorObservador());
        atendimento.adicionarObservador(new VeterinarioObservador("Dr. Silva"));
        atendimento.adicionarObservador(new RecepcaoObservador());

        System.out.println("=== Fluxo de Atendimento ===");
        System.out.println("Situação inicial : " + atendimento.getNomeSituacao());

        atendimento.iniciar();
        System.out.println("Situação após iniciar : " + atendimento.getNomeSituacao());

        atendimento.finalizar();
        System.out.println("Situação após finalizar: " + atendimento.getNomeSituacao());

        //   Tentativa inválida
        System.out.println("\n=== Tentativa de cancelar atendimento finalizado ===");
        try {
            atendimento.cancelar();
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        //  Fluxo de cancelamento
        System.out.println("\n=== Outro atendimento cancelado ===");
        Atendimento outro = new Atendimento(
                new Animal("Mimi", "Gato", false, new Tutor("João", "88888-1111")),
                new ServicoBase("Vacinação", 80.0));

        outro.adicionarObservador(new TutorObservador());
        outro.adicionarObservador(new VeterinarioObservador("Dr. Silva"));
        outro.adicionarObservador(new RecepcaoObservador());

        System.out.println("Situação inicial: " + outro.getNomeSituacao());
        outro.cancelar();
        System.out.println("Situação após cancelar: " + outro.getNomeSituacao());
    }
}
