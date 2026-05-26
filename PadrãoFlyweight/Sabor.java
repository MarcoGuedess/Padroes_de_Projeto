package padroesestruturais.flyweight;

public class Sabor {

    private String nomeSabor;
    private double precoBase;

    public Sabor(String nomeSabor, double precoBase) {
        this.nomeSabor = nomeSabor;
        this.precoBase = precoBase;
    }

    public String getNomeSabor() {
        return nomeSabor;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}