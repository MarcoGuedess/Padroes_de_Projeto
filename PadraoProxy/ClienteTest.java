public class ClienteTest {
    public static void main(String[] args) {
        Documento documento = new Documento("Relatório de Aplicação Médica", "Marco Antônio", "Resultados toxicologicos");
        DocumentoProxy proxy = new DocumentoProxy(documento);

        Funcionario comum = new Funcionario("Camila", false);
        Funcionario admin = new Funcionario("Pedro", true);

        // 1. Teste de acesso às informações públicas
        System.out.println("=== TESTE 1: Informações públicas ===");
        System.out.println(proxy.obterInformacoesPublicas());

        // 2. Teste de acesso às informações confidenciais por funcionário comum
        System.out.println("\n=== TESTE 2: Informações confidenciais (funcionário comum) ===");
        try {
            System.out.println(proxy.obterInformacoesConfidenciais(comum));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 3. Teste de acesso às informações confidenciais por administrador
        System.out.println("\n=== TESTE 3: Informações confidenciais (administrador) ===");
        System.out.println(proxy.obterInformacoesConfidenciais(admin));

        // 4. Teste de múltiplos acessos consecutivos
        System.out.println("\n=== TESTE 4: Acessos consecutivos ===");
        System.out.println("Primeiro acesso público: " + proxy.obterInformacoesPublicas());
        System.out.println("Segundo acesso confidencial (admin): " + proxy.obterInformacoesConfidenciais(admin));

        // 5. Teste de alteração de permissões
        System.out.println("\n=== TESTE 5: Alteração de permissões ===");
        comum = new Funcionario("Camila", true); // agora Camila é administradora
        System.out.println("Confidenciais (Camila agora admin): " + proxy.obterInformacoesConfidenciais(comum));
    }
}

