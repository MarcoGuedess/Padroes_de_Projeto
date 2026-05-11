package padroescriacao.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FornecedorBuilderTest {

    @Test
    public void deveRetornarExcecaoParaFornecedorSemCodigo() {
        FornecedorBuilder builder = new FornecedorBuilder();
        builder.setRazaoSocial("Fornecedor Teste LTDA");

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> builder.build()
        );
        assertEquals("Código inválido", exception.getMessage());
    }

    @Test
    public void deveRetornarExcecaoParaFornecedorSemRazaoSocial() {
        FornecedorBuilder builder = new FornecedorBuilder();
        builder.setCodigo(1);

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> builder.build()
        );
        assertEquals("Razão Social inválida", exception.getMessage());
    }

    @Test
    public void deveRetornarFornecedorValido() {
        Fornecedor fornecedor = new FornecedorBuilder()
            .setCodigo(1)
            .setRazaoSocial("Fornecedor Teste LTDA")
            .setCnpj("12.345.678/0001-90")
            .setTelefone("(11) 99999-9999")
            .setEmail("contato@fornecedor.com.br")
            .build();

        assertNotNull(fornecedor);
        assertEquals(1, fornecedor.getCodigo());
        assertEquals("Fornecedor Teste LTDA", fornecedor.getRazaoSocial());
    }
}
