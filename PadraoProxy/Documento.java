import java.util.Arrays;
import java.util.List;

public class Documento implements IDocumento {
    private String titulo;
    private String autor;
    private String conteudoConfidencial;

    public Documento(String titulo, String autor, String conteudoConfidencial) {
        this.titulo = titulo;
        this.autor = autor;
        this.conteudoConfidencial = conteudoConfidencial;
    }

    @Override
    public List<String> obterInformacoesPublicas() {
        return Arrays.asList(this.titulo, this.autor);
    }

    @Override
    public List<String> obterInformacoesConfidenciais(Funcionario funcionario) {
        return Arrays.asList(this.conteudoConfidencial);
    }
}

