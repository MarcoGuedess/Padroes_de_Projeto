package padroescriacao.builder;

public class FornecedorBuilder {

    private Fornecedor fornecedor;

    public FornecedorBuilder() {
        this.fornecedor = new Fornecedor();
    }

    public FornecedorBuilder setCodigo(int codigo) {
        this.fornecedor.setCodigo(codigo);
        return this;
    }

    public FornecedorBuilder setRazaoSocial(String razaoSocial) {
        this.fornecedor.setRazaoSocial(razaoSocial);
        return this;
    }

    public FornecedorBuilder setCnpj(String cnpj) {
        this.fornecedor.setCnpj(cnpj);
        return this;
    }

    public FornecedorBuilder setTelefone(String telefone) {
        this.fornecedor.setTelefone(telefone);
        return this;
    }

    public FornecedorBuilder setEmail(String email) {
        this.fornecedor.setEmail(email);
        return this;
    }

    public FornecedorBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        this.fornecedor.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public FornecedorBuilder setEnderecoNumero(int enderecoNumero) {
        this.fornecedor.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public FornecedorBuilder setEnderecoBairro(String enderecoBairro) {
        this.fornecedor.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public FornecedorBuilder setEnderecoCidade(String enderecoCidade) {
        this.fornecedor.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public FornecedorBuilder setEnderecoUF(String enderecoUF) {
        this.fornecedor.setEnderecoUF(enderecoUF);
        return this;
    }

    public FornecedorBuilder setCep(String cep) {
        this.fornecedor.setCep(cep);
        return this;
    }

    public Fornecedor build() {
        if (this.fornecedor.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (this.fornecedor.getRazaoSocial().equals("")) {
            throw new IllegalArgumentException("Razão Social inválida");
        }
        return this.fornecedor;
    }
}
