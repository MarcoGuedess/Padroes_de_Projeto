public class RegraAND implements InterpretadorRegra {
    private InterpretadorRegra esquerda;
    private InterpretadorRegra direita;

    public RegraAND(InterpretadorRegra esquerda, InterpretadorRegra direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return esquerda.interpretar(contexto) && direita.interpretar(contexto);
    }
}

