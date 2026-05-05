package mercadinho.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria("João Silva", 500.0f);
    }

    // Conta Ativa

    @Test
    public void deveDepositarEmContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.depositar(100.0f));
        assertEquals(600.0f, conta.getSaldo(), 0.01f);
    }

    @Test
    public void deveSacarEmContaAtivaComSaldo() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.sacar(200.0f));
        assertEquals(300.0f, conta.getSaldo(), 0.01f);
    }

    @Test
    public void deveSacarEmContaAtivaeSaldoInsuficienteLevaParaNegativada() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.sacar(600.0f));
        assertEquals(ContaEstadoNegativada.getInstance(), conta.getEstado());
        assertEquals(-100.0f, conta.getSaldo(), 0.01f);
    }

    @Test
    public void deveBloqueioEmContaAtivaLevaParaBloqueada() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveEncerrarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveReativarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.reativar());
    }

    // Conta Bloqueada

    @Test
    public void naoDeveDepositarEmContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.depositar(100.0f));
    }

    @Test
    public void naoDeveSacarEmContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.sacar(100.0f));
    }

    @Test
    public void naoDeveBloquearContaJaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.bloquear());
    }

    @Test
    public void deveEncerrarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveReativarContaBloqueadaLevaParaAtiva() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.reativar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    // Conta Negativada

    @Test
    public void deveDepositarEmContaNegativadaMantemNegativadaQuandoSaldoNegativo() {
        conta.setEstado(ContaEstadoNegativada.getInstance());
        conta.setSaldo(-200.0f);
        assertTrue(conta.depositar(100.0f));
        assertEquals(ContaEstadoNegativada.getInstance(), conta.getEstado());
        assertEquals(-100.0f, conta.getSaldo(), 0.01f);
    }

    @Test
    public void deveDepositarEmContaNegativadaLevaParaAtivaQuandoSaldoZerado() {
        conta.setEstado(ContaEstadoNegativada.getInstance());
        conta.setSaldo(-100.0f);
        assertTrue(conta.depositar(100.0f));
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveSacarEmContaNegativada() {
        conta.setEstado(ContaEstadoNegativada.getInstance());
        assertFalse(conta.sacar(100.0f));
    }

    @Test
    public void deveBloqueioEmContaNegativadaLevaParaBloqueada() {
        conta.setEstado(ContaEstadoNegativada.getInstance());
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveEncerrarContaNegativada() {
        conta.setEstado(ContaEstadoNegativada.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    // Conta Encerrada

    @Test
    public void naoDeveDepositarEmContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.depositar(100.0f));
    }

    @Test
    public void naoDeveSacarEmContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.sacar(100.0f));
    }

    @Test
    public void naoDeveBloquearContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.bloquear());
    }

    @Test
    public void naoDeveEncerrarContaJaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.encerrar());
    }

    @Test
    public void naoDeveReativarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.reativar());
    }

}
