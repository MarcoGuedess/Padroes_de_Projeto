public class RegraTest {
    public static void main(String[] args) {
        // Regras básicas
        InterpretadorRegra regraVIP = new RegraClienteVIP();
        InterpretadorRegra regraValor700 = new RegraValorMinimo(700);
        InterpretadorRegra regraValor1500 = new RegraValorMinimo(1500);

        // Combinações de regras
        InterpretadorRegra regraVIPeValor700 = new RegraAND(regraVIP, regraValor700);
        InterpretadorRegra regraVIPeValor1500 = new RegraOR(regraVIP, regraValor1500);

        // Contextos de teste
        Contexto c1 = new Contexto(true, 750);   // VIP e compra > 700
        Contexto c2 = new Contexto(true, 300);   // VIP mas compra < 700
        Contexto c3 = new Contexto(false, 700);  // Não VIP mas compra > 700
        Contexto c4 = new Contexto(false, 1600); // Não VIP mas compra > 1500
        Contexto c5 = new Contexto(true, 1200);  // VIP e compra > 1500
        Contexto c6 = new Contexto(false, 200);  // Não VIP e compra baixa

        // Testes individuais
        System.out.println("Regra VIP (c1): " + regraVIP.interpretar(c1)); // true
        System.out.println("Regra VIP (c3): " + regraVIP.interpretar(c3)); // false

        System.out.println("Regra Valor >= 700 (c2): " + regraValor700.interpretar(c2)); // false
        System.out.println("Regra Valor >= 700 (c3): " + regraValor700.interpretar(c3)); // true

        // Testes combinados com AND
        System.out.println("VIP AND Valor >= 700 (c1): " + regraVIPeValor700.interpretar(c1)); // true
        System.out.println("VIP AND Valor >= 700 (c2): " + regraVIPeValor700.interpretar(c2)); // false
        System.out.println("VIP AND Valor >= 700 (c3): " + regraVIPeValor700.interpretar(c3)); // false

        // Testes combinados com OR
        System.out.println("VIP OR Valor >= 1500 (c4): " + regraVIPeValor1500.interpretar(c4)); // true
        System.out.println("VIP OR Valor >= 1500 (c5): " + regraVIPeValor1500.interpretar(c5)); // true
        System.out.println("VIP OR Valor >= 1500 (c6): " + regraVIPeValor1500.interpretar(c6)); // false
    }
}

