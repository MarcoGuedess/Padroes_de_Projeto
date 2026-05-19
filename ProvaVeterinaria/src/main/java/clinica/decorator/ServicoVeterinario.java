package clinica.decorator;

/**
 * Interface base para serviços veterinários — usada pelo Decorator Pattern.
 * Define o contrato de valor e descrição que todos os serviços devem cumprir.
 */
public interface ServicoVeterinario {

    double getValor();

    String getDescricao();
}
