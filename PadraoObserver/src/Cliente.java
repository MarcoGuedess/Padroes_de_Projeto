package mercadinho.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void inscrever(ContaInvestimento conta) {
        conta.addObserver(this);
    }

    public void update(Observable conta, Object arg) {
        this.ultimaNotificacao = "Cliente " + this.nome + " notificado: " + conta.toString();
        System.out.println(this.ultimaNotificacao);
    }
}
