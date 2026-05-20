public class PedidoVisitor implements ItemVisitor {

    public String exibir(ItemCardapio item) {
        return item.aceitar(this);
    }

    @Override
    public String visitarHamburguer(Hamburguer hamburguer) {
        return "Hamburguer{" +
                "codigo=" + hamburguer.getCodigo() +
                ", nome='" + hamburguer.getNome() + '\'' +
                ", tipo='" + hamburguer.getTipo() + '\'' +
                ", preco=R$" + hamburguer.getPreco() +
                '}';
    }

    @Override
    public String visitarBebida(Bebida bebida) {
        return "Bebida{" +
                "codigo=" + bebida.getCodigo() +
                ", nome='" + bebida.getNome() + '\'' +
                ", tamanho='" + bebida.getTamanho() + '\'' +
                ", preco=R$" + bebida.getPreco() +
                '}';
    }

    @Override
    public String visitarAcompanhamento(Acompanhamento acompanhamento) {
        return "Acompanhamento{" +
                "codigo=" + acompanhamento.getCodigo() +
                ", nome='" + acompanhamento.getNome() + '\'' +
                ", porcao=" + acompanhamento.getPorcaoGramas() + "g" +
                ", preco=R$" + acompanhamento.getPreco() +
                '}';
    }
}
