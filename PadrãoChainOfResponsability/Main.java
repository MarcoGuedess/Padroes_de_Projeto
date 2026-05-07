package padroescomportamentais.chainofresponsability;

public class Main {

    public static void main(String[] args) {

        // 1. Montar a cadeia de responsabilidade (de cima para baixo)
        // O Diretor não tem superior (null), o Gerente responde ao Diretor, etc.
        DiretorFinanceiro diretor = new DiretorFinanceiro(null);
        GerenteLoja gerente = new GerenteLoja(diretor);
        FiscalCaixa fiscal = new FiscalCaixa(gerente);
        OperadorCaixa operador = new OperadorCaixa(fiscal);

        // 2. Criar os diferentes tipos de requisições que os clientes podem fazer
        Requisicao reqTroca = new Requisicao(TipoRequisicaoTrocaBasica.getInstancia());
        Requisicao reqCancelamento = new Requisicao(TipoRequisicaoCancelamentoItem.getInstancia());
        Requisicao reqDesconto = new Requisicao(TipoRequisicaoDesconto.getInstancia());
        Requisicao reqEstorno = new Requisicao(TipoRequisicaoEstornoCartao.getInstancia());
        Requisicao reqFiado = new Requisicao(TipoRequisicaoPagamentoFiado.getInstancia());

        // 3. Processar as requisições (enviamos sempre para o nível mais baixo: o Operador)
        System.out.println("=== SISTEMA DE AUTORIZAÇÕES DO MERCADINHO ===\n");

        System.out.println("Situação 1: O cliente pediu uma Troca Básica.");
        System.out.println("-> Autorizado por: " + operador.autorizarRequisicao(reqTroca) + "\n");

        System.out.println("Situação 2: O cliente pediu o Cancelamento de um Item.");
        System.out.println("-> Autorizado por: " + operador.autorizarRequisicao(reqCancelamento) + "\n");

        System.out.println("Situação 3: O cliente pediu um Desconto no valor total.");
        System.out.println("-> Autorizado por: " + operador.autorizarRequisicao(reqDesconto) + "\n");

        System.out.println("Situação 4: O cliente pediu um Estorno no Cartão de Crédito.");
        System.out.println("-> Autorizado por: " + operador.autorizarRequisicao(reqEstorno) + "\n");

        System.out.println("Situação 5: O cliente quer pagar Fiado.");
        System.out.println("-> Autorizado por: " + operador.autorizarRequisicao(reqFiado) + "\n");
    }
}