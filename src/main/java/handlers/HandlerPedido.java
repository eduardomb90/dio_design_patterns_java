package main.java.handlers;

import main.java.models.Pedido;

abstract class HandlerPedido {
    protected HandlerPedido sucessor;

    public void setSucessor (HandlerPedido sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void handlePedido(Pedido pedido);
}
