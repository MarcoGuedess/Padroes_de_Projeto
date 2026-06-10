public class RegraClienteVIP implements InterpretadorRegra {
    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.isClienteVIP();
    }
}
