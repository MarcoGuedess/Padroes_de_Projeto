import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Comando> historico = new ArrayList<>();

    public void executarComando(Comando comando) {
        historico.add(comando);
        comando.executar();
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Comando ultimo = historico.remove(historico.size() - 1);
            ultimo.cancelar();
        }
    }
}

