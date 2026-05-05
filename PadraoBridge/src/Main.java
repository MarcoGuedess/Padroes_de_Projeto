package mercadinho.bridge;

public class Main {
    public static void main(String[] args) {
        Promocao fidelidade = new mercadinho.bridge.ClienteFiel();


        ProdutoUnitario arroz = new ProdutoUnitario(20.0f);
        arroz.setPromocao(fidelidade);
        System.out.println("Preço Arroz: " + arroz.calcularPrecoFinal());

        ProdutoPesavel carne = new ProdutoPesavel(50.0f); // valor
        carne.setPesoKg(2.0f);
        carne.setPromocao(fidelidade);
        System.out.println("Preço Carne: " + carne.calcularPrecoFinal());
    }
}