package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SaborFactory {
    private static Map<String, Sabor> sabores = new HashMap<>();

    public static Sabor getSabor(String nomeSabor, double precoBase) {
        Sabor sabor = sabores.get(nomeSabor);
        if (sabor == null) {
            sabor = new Sabor(nomeSabor, precoBase);
            sabores.put(nomeSabor, sabor);
        }
        return sabor;
    }

    public static int getTotalSabores() {
        return sabores.size();
    }
}