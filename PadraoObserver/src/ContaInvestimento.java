package mercadinho.observer;

import java.util.Observable;

public class ContaInvestimento extends Observable {

    private String nomeInvestimento;
    private float valorAtual;
    private float rentabilidade;

    public ContaInvestimento(String nomeInvestimento, float valorAtual, float rentabilidade) {
        this.nomeInvestimento = nomeInvestimento;
        this.valorAtual = valorAtual;
        this.rentabilidade = rentabilidade;
    }

    public void atualizarValor(float novoValor) {
        this.valorAtual = novoValor;
        setChanged();
        notifyObservers();
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public float getValorAtual() {
        return valorAtual;
    }

    public float getRentabilidade() {
        return rentabilidade;
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "nomeInvestimento='" + nomeInvestimento + '\'' +
                ", valorAtual=" + valorAtual +
                ", rentabilidade=" + rentabilidade + "%" +
                '}';
    }
}
