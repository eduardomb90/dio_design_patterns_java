package main.java.handlers;

import main.java.models.Pedido;

public class HandlerPedidoInternacional extends HandlerPedido{

    @Override
    public void handlePedido(Pedido pedido) {
        if (!pedido.ehDomestico()) {
            System.out.println("Pedido internacional processado");
        }
        else if (sucessor != null) {
            sucessor.handlePedido(pedido);
        }
    }
}
