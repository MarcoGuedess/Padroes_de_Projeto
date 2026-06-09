import java.util.List;

public interface IDocumento {
    List<String> obterInformacoesPublicas();
    List<String> obterInformacoesConfidenciais(Funcionario funcionario);
}
