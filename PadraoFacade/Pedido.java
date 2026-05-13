package padroesestruturais.facade;

public class Pedido {

    public boolean liberarParaEntrega() {
        return PedidoFacade.verificarPendenciasLiberacao(this);
    }
}
