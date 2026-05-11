package padroescriacao.builder;

public class Fornecedor {

    private int codigo;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String email;
    private String enderecoLogradouro;
    private int enderecoNumero;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUF;
    private String cep;

    public Fornecedor() {
        this.codigo = 0;
        this.razaoSocial = "";
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEnderecoLogradouro() { return enderecoLogradouro; }
    public void setEnderecoLogradouro(String enderecoLogradouro) { this.enderecoLogradouro = enderecoLogradouro; }

    public int getEnderecoNumero() { return enderecoNumero; }
    public void setEnderecoNumero(int enderecoNumero) { this.enderecoNumero = enderecoNumero; }

    public String getEnderecoBairro() { return enderecoBairro; }
    public void setEnderecoBairro(String enderecoBairro) { this.enderecoBairro = enderecoBairro; }

    public String getEnderecoCidade() { return enderecoCidade; }
    public void setEnderecoCidade(String enderecoCidade) { this.enderecoCidade = enderecoCidade; }

    public String getEnderecoUF() { return enderecoUF; }
    public void setEnderecoUF(String enderecoUF) { this.enderecoUF = enderecoUF; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
}
