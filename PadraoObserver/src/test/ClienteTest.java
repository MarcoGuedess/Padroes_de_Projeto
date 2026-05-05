package mercadinho.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        ContaInvestimento tesouro = new ContaInvestimento("Tesouro Direto", 1000.0f, 12.5f);
        Cliente joao = new Cliente("João");
        joao.inscrever(tesouro);
        tesouro.atualizarValor(1050.0f);
        assertEquals("Cliente João notificado: ContaInvestimento{nomeInvestimento='Tesouro Direto', valorAtual=1050.0, rentabilidade=12.5%}", joao.getUltimaNotificacao());
    }

    @Test
    void deveNotificarVariosClientes() {
        ContaInvestimento tesouro = new ContaInvestimento("Tesouro Direto", 1000.0f, 12.5f);
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");
        joao.inscrever(tesouro);
        maria.inscrever(tesouro);
        tesouro.atualizarValor(1050.0f);
        assertEquals("Cliente João notificado: ContaInvestimento{nomeInvestimento='Tesouro Direto', valorAtual=1050.0, rentabilidade=12.5%}", joao.getUltimaNotificacao());
        assertEquals("Cliente Maria notificado: ContaInvestimento{nomeInvestimento='Tesouro Direto', valorAtual=1050.0, rentabilidade=12.5%}", maria.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClienteNaoInscrito() {
        ContaInvestimento tesouro = new ContaInvestimento("Tesouro Direto", 1000.0f, 12.5f);
        Cliente joao = new Cliente("João");
        tesouro.atualizarValor(1050.0f);
        assertNull(joao.getUltimaNotificacao());
    }

    @Test
    void deveNotificarApenasClienteDoInvestimentoA() {
        ContaInvestimento tesouroDireto = new ContaInvestimento("Tesouro Direto", 1000.0f, 12.5f);
        ContaInvestimento cdb = new ContaInvestimento("CDB", 2000.0f, 10.0f);
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");
        joao.inscrever(tesouroDireto);
        maria.inscrever(cdb);
        tesouroDireto.atualizarValor(1050.0f);
        assertEquals("Cliente João notificado: ContaInvestimento{nomeInvestimento='Tesouro Direto', valorAtual=1050.0, rentabilidade=12.5%}", joao.getUltimaNotificacao());
        assertNull(maria.getUltimaNotificacao());
    }

}
