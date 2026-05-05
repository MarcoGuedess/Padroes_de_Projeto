package mercadinho.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveProcessarPagamentoVendaFisica() {
        FabricaVenda fabrica = new FabricaVendaFisica();
        Venda venda = new Venda(fabrica);
        assertEquals("Pagamento em Dinheiro", venda.processarPagamento());
    }

    @Test
    void deveEmitirReciboVendaFisica() {
        FabricaVenda fabrica = new FabricaVendaFisica();
        Venda venda = new Venda(fabrica);
        assertEquals("Recibo Impresso na via do cliente", venda.emitirRecibo());
    }

    @Test
    void deveProcessarPagamentoVendaDigital() {
        FabricaVenda fabrica = new FabricaVendaDigital();
        Venda venda = new Venda(fabrica);
        assertEquals("Pagamento via Pix", venda.processarPagamento());
    }

    @Test
    void deveEmitirReciboVendaDigital() {
        FabricaVenda fabrica = new FabricaVendaDigital();
        Venda venda = new Venda(fabrica);
        assertEquals("Recibo Digital enviado por e-mail", venda.emitirRecibo());
    }
}