public class Cliente {
    public static void main(String[] args) {
        Documento documento = new Documento("Relatório de Aplicação Médica", "Marco Antônio", "Resultados toxicologicos");
        DocumentoProxy proxy = new DocumentoProxy(documento);

        Funcionario comum = new Funcionario("Camila", false);
        Funcionario admin = new Funcionario("Pedro", true);

        System.out.println("Informações públicas: " + proxy.obterInformacoesPublicas());

        try {
            System.out.println("Confidenciais (Camila): " + proxy.obterInformacoesConfidenciais(comum));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Confidenciais (Pedro): " + proxy.obterInformacoesConfidenciais(admin));
    }
}
