package main.java.handlers;

import main.java.models.Pedido;

public class HandlerPedidoDomestico extends HandlerPedido {
    @Override
    public void handlePedido(Pedido pedido) {
        if(pedido.ehDomestico()) {
            System.out.println("Pedido doméstico processado");
        }
        else if (sucessor != null) {
            sucessor.handlePedido(pedido);
        }
    }
}
