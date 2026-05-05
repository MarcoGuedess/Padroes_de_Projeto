package mercadinho.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Vendas do Mercadinho (Abstract Factory) ---\n");

        // 1. Simulando um cliente passando as compras no caixa físico
        System.out.println("🛒 Iniciando Venda Balcão (Física)...");
        FabricaVenda fabricaFisica = new FabricaVendaFisica();
        Venda vendaBalcao = new Venda(fabricaFisica);

        System.out.println("Status Pagamento: " + vendaBalcao.processarPagamento());
        System.out.println("Status Recibo: " + vendaBalcao.emitirRecibo());
        System.out.println("----------------------------------------------------------");

        // 2. Simulando um cliente pedindo compras pelo aplicativo (Delivery)
        System.out.println("📱 Iniciando Venda App (Digital)...");
        FabricaVenda fabricaDigital = new FabricaVendaDigital();
        Venda vendaApp = new Venda(fabricaDigital);

        System.out.println("Status Pagamento: " + vendaApp.processarPagamento());
        System.out.println("Status Recibo: " + vendaApp.emitirRecibo());
        System.out.println("----------------------------------------------------------");
    }
}