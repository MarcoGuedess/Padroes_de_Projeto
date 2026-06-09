import java.util.List;

public class DocumentoProxy implements IDocumento {
    private Documento documento;

    public DocumentoProxy(Documento documento) {
        this.documento = documento;
    }

    @Override
    public List<String> obterInformacoesPublicas() {
        return documento.obterInformacoesPublicas();
    }

    @Override
    public List<String> obterInformacoesConfidenciais(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Acesso negado: funcionário não autorizado");
        }
        return documento.obterInformacoesConfidenciais(funcionario);
    }
}

