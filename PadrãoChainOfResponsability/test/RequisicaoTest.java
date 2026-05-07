package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequisicaoTest {

    DiretorFinanceiro diretorFinanceiro;
    GerenteLoja gerenteLoja;
    FiscalCaixa fiscalCaixa;
    OperadorCaixa operadorCaixa;

    @BeforeEach
    void setUp() {
        // Montamos a cadeia de baixo para cima: Diretor -> Gerente -> Fiscal -> Operador
        diretorFinanceiro = new DiretorFinanceiro(null);
        gerenteLoja = new GerenteLoja(diretorFinanceiro);
        fiscalCaixa = new FiscalCaixa(gerenteLoja);
        operadorCaixa = new OperadorCaixa(fiscalCaixa);
    }

    @Test
    void deveRetornarOperadorCaixaParaTrocaBasica() {
        assertEquals("Operador de Caixa", operadorCaixa.autorizarRequisicao(new Requisicao(TipoRequisicaoTrocaBasica.getInstancia())));
    }

    @Test
    void deveRetornarFiscalCaixaParaCancelamentoItem() {
        assertEquals("Fiscal de Caixa", operadorCaixa.autorizarRequisicao(new Requisicao(TipoRequisicaoCancelamentoItem.getInstancia())));
    }

    @Test
    void deveRetornarGerenteLojaParaDesconto() {
        assertEquals("Gerente da Loja", operadorCaixa.autorizarRequisicao(new Requisicao(TipoRequisicaoDesconto.getInstancia())));
    }

    @Test
    void deveRetornarDiretorFinanceiroParaEstornoCartao() {
        assertEquals("Diretor Financeiro", operadorCaixa.autorizarRequisicao(new Requisicao(TipoRequisicaoEstornoCartao.getInstancia())));
    }

    @Test
    void deveRetornarNaoAutorizadoParaPagamentoFiado() {
        // Pagamento fiado não está na lista de ninguém, logo a cadeia chega ao fim e recusa.
        assertEquals("Não autorizado", operadorCaixa.autorizarRequisicao(new Requisicao(TipoRequisicaoPagamentoFiado.getInstancia())));
    }

}