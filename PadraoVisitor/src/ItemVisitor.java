public interface ItemVisitor {
    String visitarHamburguer(Hamburguer hamburguer);
    String visitarBebida(Bebida bebida);
    String visitarAcompanhamento(Acompanhamento acompanhamento);
}
