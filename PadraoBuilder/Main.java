package padroescriacao.builder;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new FornecedorBuilder()
                .setCodigo(1)
                .setRazaoSocial("Distribuidora ABC LTDA")
                .setCnpj("12.345.678/0001-90")
                .setTelefone("(11) 99999-9999")
                .setEmail("contato@distribuidoraabc.com.br")
                .setEnderecoLogradouro("Rua das Flores")
                .setEnderecoNumero(100)
                .setEnderecoBairro("Centro")
                .setEnderecoCidade("São Paulo")
                .setEnderecoUF("SP")
                .setCep("01000-000")
                .build();

        System.out.println("Fornecedor criado: " + fornecedor.getRazaoSocial() + " (cód. " + fornecedor.getCodigo() + ")");
    }
}
